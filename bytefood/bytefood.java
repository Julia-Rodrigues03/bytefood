package bytefood;

import java.util.ArrayList;
import java.util.Scanner;

public class bytefood {
        private static ArrayList<String> produtos = new ArrayList<>();

        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao = -1;

            while (opcao != 0) {
                System.out.println("\n" + "=".repeat(50) );
                System.out.println("Bytefood 1.0");
                System.out.println("\n" + "=".repeat(50) );
                System.out.println("[1] Gerenciar resturantes");
                System.out.println("[2] Gerenciar Clientes");
                System.out.println("[3] Catálogo De Produtos");
                System.out.println("[4] Fazer Novo Pedido");
                System.out.println("[5] Acompanhar Entregas");
                System.out.println("[0] Sair");
                System.out.println("=".repeat(50) );

                System.out.println("Escolha uma opção" );

                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                case 1:
                    System.out.println("\n-> Abrindo módulo de Restaurantes...");
                    // Exemplo: menuRestaurante.exibir();
                    break;
                case 2:
                    System.out.println("\n-> Abrindo módulo de Clientes...");
                    // Exemplo: menuCliente.exibir();
                    break;
                case 3:
                    System.out.println("\n--- CADASTRO DE PRODUTO ---");
                    
                    System.out.print("Nome do produto: ");
                    String nomeProd = scanner.nextLine();
                    
                    System.out.print("Descrição: ");
                    String descProd = scanner.nextLine();
                    
                    System.out.print("Preço: ");
                    double precoProd = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer do enter

                    // 1. Cria o objeto na memória do Java
                    produtos novoProduto = new produtos(nomeProd, descProd, precoProd);
                    
                    // 2. Envia para o Banco de Dados
                    produtoDAO prodDAO = new produtoDAO();
                    prodDAO.cadastrarNoBanco(novoProduto);
                    
                    break;
                case 4:
                    System.out.println("\n-> Iniciando fluxo de Novo Pedido...");
                    break;
                case 5:
                    System.out.println("\n-> Abrindo painel de Entregas...");
                    break;
                case 0:
                    System.out.println("\nEncerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, digite um número de 0 a 5.");
                
                }
            }

            scanner.close();

        }
    
}