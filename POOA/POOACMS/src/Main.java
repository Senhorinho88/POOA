import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Conteudo> conteudos = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.printf("1. Login\n2. Listar Conteúdos\n4. Sair%n");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Login.main(null);
                    MenuAposLogin();
                    break;
                case 2:listarConteudo();
                    break;
                case 4:
                    System.exit(0);
                default: System.out.println("Opcao invalida");
                break;
            }

        }
    }
    public static void MenuAposLogin() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("1. Criar Conteúdo\n2. Listar Conteúdos\n3. Atualizar Conteúdo\n4. Excluir Conteúdo\n5. Sair%n");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    criarConteudo();
                    break;
                case 2:
                    listarConteudo();
                    break;
                case 3: atualizarConteudo();
                    break;
                case 4: excluirConteudo();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

    }
    public static void criarConteudo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do filme:");
        String titulo = sc.nextLine();
        System.out.print("Digite a sinopse do filme:");
        String descricao = sc.nextLine();

        Conteudo conteudo = new Conteudo(titulo, descricao);
        conteudos.add(conteudo);
        System.out.println("Filme adicionado com sucesso!");

    }
    public static void listarConteudo() {
        if (conteudos.isEmpty()) {
            System.out.println("Não há filmes adicionados! Faça sua primeira contribuição!");
        }else{
            for (Conteudo conteudo : conteudos) {
                System.out.println(conteudo);
            }

        }
    }
    public static void atualizarConteudo() {
        if (conteudos.isEmpty()) {
            System.out.println("Não há filmes adicionados! Faça sua primeira contribuição!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha o filme que deseja atualizar: \n");
        for (int i = 0; i < conteudos.size(); i++) {
            System.out.print((i + 1) + ". " + conteudos.get(i).getTitulo() + "\n") ;
        }
        int op = sc.nextInt();
        sc.nextLine();

        if (op >= 1 && op <= conteudos.size()) {
            Conteudo conteudoSelecionado = conteudos.get(op - 1);
            System.out.println("Digite o novo título: ");
            String novoTitulo = sc.nextLine();
            conteudoSelecionado.setTitulo(novoTitulo);

            System.out.println("Digite a nova sinopse: ");
            String novoDescricao = sc.nextLine();
            conteudoSelecionado.setDescricao(novoDescricao);

            System.out.println("Conteúdo atualizado com sucesso");
        } else {
            System.out.println("Opção inválida");
        }
    }

    public static void excluirConteudo() {
        if (conteudos.isEmpty()) {
            System.out.println("Não há filmes adicionados! Faça sua primeira contribuição!");

        }else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Escolha o filme que deseja Excluir: \n");
            for (int i = 0; i < conteudos.size(); i++) {
                System.out.print((i + 1) + ". " + conteudos.get(i).getTitulo() + "\n") ;
            }
            int op = sc.nextInt();
            sc.nextLine();
            if (op >= 1 && op <= conteudos.size()) {
                conteudos.remove(op - 1);
                System.out.println("Filme excluido com sucesso!");
            }
        }
    }

}




