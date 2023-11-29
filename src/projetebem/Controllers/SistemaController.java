package projetebem.Controllers;

import projetebem.Views.CadastrarTarefa;
import projetebem.Views.Cadastro;
import projetebem.Views.Login;
import projetebem.Views.QuemSomos;
import projetebem.Views.TelaInicial;
import projetebem.Models.UsuarioModel;

public class SistemaController {
    
    public static CadastrarTarefa cadastrarTarefa;
    public static Cadastro cadastro;
    public static Login login;
    public static QuemSomos quemSomos;
    public static TelaInicial telaInicial;
    public static UsuarioModel usuario;
    
    
    public void SistemaController(){
        
        cadastrarTarefa = null;
        cadastro = null;
        login = null;
        quemSomos = null;
        telaInicial = null;
        usuario = null;
    }
    
}
