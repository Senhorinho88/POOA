import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        String username = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login efetuado com sucesso!");

        }else{
            System.out.println("Usuário ou senha incorreto");
        }

    }
    //Essa parte é para escrever lógica com conexões (Login Sério =P)
    //public static boolean validarUsuario(String usuario, String senha) {

        //if (usuario.equals("admin") && senha.equals("admin")) {
            //return true;
       // }
       // return false;
   // }
}
