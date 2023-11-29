package projetebem.Models;

public class ProjetosModel {
    private int id;
    private String nome;
    private String descricao;
    private String data;
    private String setor;
    private String colaborador;
    private boolean completo;
    
    public ProjetosModel(){}
    
    public ProjetosModel(String nome, String descricao, String data, String setor, String colaborador, boolean completo){
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.setor = setor;
        this.colaborador = colaborador;
        this.completo = completo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return the colaborador
     */
    public String getColaborador() {
        return colaborador;
    }

    /**
     * @param colaborador the colaborador to set
     */
    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }
    
    
}
