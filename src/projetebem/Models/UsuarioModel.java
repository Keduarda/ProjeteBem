package projetebem.Models;

public class UsuarioModel {
    private int ID;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String setor;

    public UsuarioModel(){}
    
    public UsuarioModel(String nome, String email, String senha, String telefone, String setor){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.setor = setor;
    }
    
    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
