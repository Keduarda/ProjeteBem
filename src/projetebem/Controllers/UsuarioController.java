package projetebem.Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import projetebem.Database.Database;
import projetebem.Models.UsuarioModel;

public class UsuarioController {
    private Database database;
    private Connection connection;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    public UsuarioController(){
        database = new Database();
        connection = database.conectarDatabase();
    }

    public ResultSet listarUsuarios(){
        try{
            String SQL = "SELECT * FROM colaboradores";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os usuários.");
            return null;
        }
    }
    
    public UsuarioModel listarUsuarioPorEmail(String email){
        try{
            String SQL = "SELECT * FROM colaboradores WHERE email = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setString(1, email);
            rs = pstm.executeQuery();
            
            if(rs.next()){
                UsuarioModel usuario = new UsuarioModel();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setSetor(rs.getString("setor"));
                
                return usuario;
            }
            
        }catch(SQLException erro){
            System.out.println("Erro ao listar o usuário através do email.");
            erro.printStackTrace();
        }
        
        return null;
    }
    
    public UsuarioModel autenticarUsuario(UsuarioModel model) {
        UsuarioModel usuarioAutenticado = null;

        try {
            String senhaCriptografada = criptografarSenha(model.getSenha());
            String SQL = "SELECT * FROM colaboradores WHERE email = ? AND senha = ?";
            try (PreparedStatement pstm = connection.prepareStatement(SQL)) {
                pstm.setString(1, model.getEmail());
                pstm.setString(2, senhaCriptografada);

                try (ResultSet rs = pstm.executeQuery()) {
                    if (rs.next()) {
                        usuarioAutenticado = new UsuarioModel();
                        usuarioAutenticado.setId(rs.getInt("id"));
                        usuarioAutenticado.setEmail(rs.getString("email"));
                        usuarioAutenticado.setSenha(rs.getString("senha"));
                    } else {
                        System.out.println("Usuário ou senha inválidos!");
                    }
                }
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao autenticar o usuário: " + erro.getMessage());
        }

        return usuarioAutenticado;
    }
    
    public boolean verificarDuplicatas(String email, String telefone) {
        try{
            String SQL = "SELECT * FROM colaboradores WHERE email = ? OR telefone = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setString(1, email);
            pstm.setString(2, telefone);
            rs = pstm.executeQuery();
            return rs.next();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public String criptografarSenha(String senha){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(senha.getBytes());
            BigInteger hashedPassword = new BigInteger(1, hash);
            String senhaCriptografada = hashedPassword.toString(16);

            while(senhaCriptografada.length() < 64){
                senhaCriptografada = "0" + senhaCriptografada;
            }

            return senhaCriptografada;
        } catch (NoSuchAlgorithmException erro) {
            erro.printStackTrace();
            return null;
        }
    }
    
    public boolean cadastrarUsuario(UsuarioModel model, String opcaoCombobox){
        try{
            String senhaCriptografada = criptografarSenha(model.getSenha());
            String SQL = "INSERT INTO colaboradores(nome, email, senha, telefone, setor) VALUES(?, ?, ?, ?, ?)";
            pstm = connection.prepareStatement(SQL);
            pstm.setString(1, model.getNome());
            pstm.setString(2, model.getEmail());
            pstm.setString(3, senhaCriptografada);
            pstm.setString(4, model.getTelefone());
            pstm.setString(5, opcaoCombobox);
            pstm.execute();
            System.out.println("Usuário cadastrado com sucesso.");
            pstm.close();
            return(true);
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return true;
    }
    
    public boolean editarUsuario(int id, String nome, String email, String telefone){
        try{
            String SQL = "UPDATE colaboradores SET nome = ?, email = ?, telefone = ? WHERE ID = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setString(1, nome);
            pstm.setString(2, email);
            pstm.setString(3, telefone);
            pstm.setInt(4, id);
            pstm.execute();
            System.out.println("Usuário alterado com sucesso.");
            pstm.close();
            return true;
        }catch(SQLException erro){
            System.out.println("Erro ao editar o usuário.");
        }
        return true;
    }
    
    //
    public void excluirUsuario(int id){
        try{
            String SQL = "DELETE FROM colaboradores WHERE ID = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setInt(1, id);
            pstm.execute();
        }catch(SQLException erro){
            System.out.println("Erro ao deletar o usuário.");
        }
    }
    
}
