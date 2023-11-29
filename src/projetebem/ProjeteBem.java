package projetebem;
import projetebem.Views.Login;
import projetebem.Controllers.SistemaController;

public class ProjeteBem {
    public static void main(String[] args) {
        SistemaController sistema = new SistemaController();
        Login login = new Login();
        login.show();
    }
}
