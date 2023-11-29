package projetebem.Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import projetebem.Database.Database;
import projetebem.Models.ProjetosModel;

public class ProjetosController {
    private Database database;
    private Connection connection;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    public ProjetosController(){
        database = new Database();
        connection = database.conectarDatabase();
    }
    
    public ResultSet listarAdministrativo(){
        try{
            String SQL = "SELECT * FROM administrativo";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os projetos.");
            return null;
        }
    }
    
    public ResultSet listarComercial(){
        try{
            String SQL = "SELECT * FROM comercial";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os projetos.");
            return null;
        }
    }
    
    public ResultSet listarCompras(){
        try{
            String SQL = "SELECT * FROM compras";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os projetos.");
            return null;
        }
    }
    
    public ResultSet listarFinanceiro(){
        try{
            String SQL = "SELECT * FROM financeiro";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os projetos.");
            return null;
        }
    }
    
    public ResultSet listarMarketing(){
        try{
            String SQL = "SELECT * FROM marketing";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os projetos.");
            return null;
        }
    }
    
    public ResultSet listarOperacoes(){
        try{
            String SQL = "SELECT * FROM operacoes";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os projetos.");
            return null;
        }
    }
    
    public ResultSet listarRecursosHumanos(){
        try{
            String SQL = "SELECT * FROM recursoshumanos";
            pstm = connection.prepareStatement(SQL);
            return pstm.executeQuery();
        }catch(SQLException erro){
            System.out.println("Erro ao listar os projetos.");
            return null;
        }
    }
    
    public boolean cadastrarProjeto(ProjetosModel model, String opcaoCombobox){
        try{
            if(opcaoCombobox.equals("recursos humanos")) opcaoCombobox = "recursoshumanos";

            String SQL = "INSERT INTO "+opcaoCombobox+"(nome, descricao, data, setor, colaboradores, completo) VALUES(?, ?, ?, ?, ?, ?)";
            pstm = connection.prepareStatement(SQL);
            pstm.setString(1, model.getNome());
            pstm.setString(2, model.getDescricao());
            pstm.setString(3, model.getData());
            pstm.setString(4, model.getSetor());
            pstm.setString(5, model.getColaborador());
            pstm.setBoolean(6, false);
            pstm.execute();
            System.out.println("Projeto cadastrado com sucesso.");
            pstm.close();
        }catch(SQLException erro){
            System.out.println("Erro ao cadastrar um projeto.");
        }
        return true;
    }
    
    public void editarProjeto(String tabela, int id, String nome, String descricao, String data, String setor, String colaboradores, int concluido){
        try{
            String SQL = "UPDATE "+ tabela +" SET nome = ?, descricao = ?, data = ?, setor = ?, colaboradores = ?, completo = ? WHERE id = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setString(1, nome);
            pstm.setString(2, descricao);
            pstm.setString(3, data);
            pstm.setString(4, setor);
            pstm.setString(5, colaboradores);
            pstm.setInt(6, concluido);
            pstm.setInt(7, id);
            System.out.println(pstm);
            pstm.execute();
            System.out.println("Projeto alterado com sucesso.");
            pstm.close();
        }catch(SQLException erro){
            System.out.println("Erro ao editar o projeto.");
        }
    }
    
    public boolean alterarValorTarefa(int id, boolean valor, String tabela){
        try{
            String SQL = "UPDATE "+tabela+" SET completo = ? WHERE id = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setBoolean(1, valor);
            pstm.setInt(2, id);
            pstm.executeUpdate();
            pstm.close();
            return true;
        }catch(SQLException erro){
            System.out.println("Erro ao marcar a tarefa como completa/incompleta.");
            return false;
        }
    }
    
    public int obterIdLinhaSelecionada(int id, String tabela){
        int idBanco = -1;
        
        try{
            String SQL = "SELECT id FROM "+tabela+" WHERE id = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if(rs.next()){
                idBanco = rs.getInt("id");
            }
            
            rs.close();
            pstm.close();
        }catch(SQLException erro){
            System.out.println("Erro ao pesquisar o ID da linha selecionada na tabela.");
        }
        
        return idBanco;
    }
    
    public void excluirProjeto(int id){
        try{
            String SQL = "DELETE FROM projetos WHERE id = ?";
            pstm = connection.prepareStatement(SQL);
            pstm.setInt(1, id);
            pstm.execute();
        }catch(SQLException erro){
            System.out.println("Erro ao deletar o projeto.");
        }
    }
}
