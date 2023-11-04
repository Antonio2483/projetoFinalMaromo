package menu;
import java.util.Scanner;

public class Menu {
 {
		

		public class Menu {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Loja minhaLoja = new Loja("Minha Concessionária");

		        while (true) {
		            System.out.println("Menu:");
		            System.out.println("1. Adicionar Veículo");
		            System.out.println("2. Remover Veículo");
		            System.out.println("3. Listar Veículos Disponíveis");
		            System.out.println("4. Listar Veículos Vendidos");
		            System.out.println("5. Calcular Valor do Estoque");
		            System.out.println("6. Sair");
		            System.out.print("Escolha uma opção: ");

		            int escolha = scanner.nextInt();

		            switch (escolha) {
		                case 1:
		                    System.out.print("Digite o tipo de veículo (Carro ou Moto): ");
		                    String tipoVeiculo = scanner.next();

		                    if (tipoVeiculo.equalsIgnoreCase("Carro")) {
		                        Carro novoCarro = new Carro();
		                        // Preencha os dados do carro
		                        minhaLoja.adicionarVeiculo(novoCarro);
		                        System.out.println("Carro adicionado com sucesso!");
		                    } else if (tipoVeiculo.equalsIgnoreCase("Moto")) {
		                        Moto novaMoto = new Moto();
		                        // Preencha os dados da moto
		                        minhaLoja.adicionarVeiculo(novaMoto);
		                        System.out.println("Moto adicionada com sucesso!");
		                    } else {
		                        System.out.println("Tipo de veículo inválido.");
		                    }
		                    break;

		                case 2:
		                    System.out.print("Digite a placa do veículo a ser removido: ");
		                    String placa = scanner.next();
		                    minhaLoja.removerVeiculo(placa);
		                    System.out.println("Veículo removido com sucesso!");
		                    break;

		                case 3:
		                    System.out.println("Veículos Disponíveis:");
		                    minhaLoja.listarVeiculos(false);
		                    break;

		                case 4:
		                    System.out.println("Veículos Vendidos:");
		                    minhaLoja.listarVeiculos(true);
		                    break;

		                case 5:
		                    double valorEstoque = minhaLoja.calcularValorEstoque();
		                    System.out.println("Valor total do estoque: R$" + valorEstoque);
		                    break;

		                case 6:
		                    System.out.println("Saindo do programa.");
		                    scanner.close();
		                    System.exit(0);

		                default:
		                    System.out.println("Opção inválida. Tente novamente.");
		            }
		        }
		    }
		}

	}

}
