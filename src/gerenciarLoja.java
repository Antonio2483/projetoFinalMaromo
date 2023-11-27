import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gerenciarLoja {
    List<Loja> listaLojas = new ArrayList<>();
    Loja lojaAtual = null;
    public static void main(String[] args) {
            gerenciarLoja gerenciar = new gerenciarLoja();
            Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("=======================================\n\n");
                String nomeLoja = "";

                if(gerenciar.lojaAtual != null){
                    nomeLoja = gerenciar.lojaAtual.getNomeLoja();
                }else{
                    nomeLoja = "NaN";
                }

                System.out.println("Loja Atual: " + nomeLoja);
                System.out.println("Menu:");
                System.out.println("1. Adicionar Veículo");
                System.out.println("2. Remover Veículo");
                System.out.println("3. Listar Veículos Disponíveis");
                System.out.println("4. Listar Veículos Vendidos");
                System.out.println("5. Calcular Valor do Estoque");
                System.out.println("6. Criar Loja");
                System.out.println("7. Trocar Loja");
                System.out.println("8. Vender um veículo");
                System.out.println("9. Sair");
                System.out.print("Escolha uma opção: ");

                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        if(gerenciar.verificarLoja()) continue;
                        System.out.print("Digite o tipo de veículo (Carro ou Moto): ");
                        String tipoVeiculo = scanner.next();

                        if (tipoVeiculo.equalsIgnoreCase("Carro")) {
                            gerenciar.criarCarro(gerenciar.lojaAtual);
                        } else if (tipoVeiculo.equalsIgnoreCase("Moto")) {
                            gerenciar.criarMoto(gerenciar.lojaAtual);
                        } else {
                            System.out.println("Tipo de veículo inválido.");
                        }
                        break;

                    case 2:
                        if(gerenciar.verificarLoja()) continue;
                        System.out.print("Digite a placa do veículo a ser removido: ");
                        String placa = scanner.next();
                        gerenciar.lojaAtual.removerVeiculo(gerenciar.lojaAtual.encontrarVeiculo(placa));
                        System.out.println("Veículo removido com sucesso!");
                        break;

                    case 3:
                        if(gerenciar.verificarLoja()) continue;
                        System.out.println("Veículos Disponíveis:");
                        gerenciar.lojaAtual.listarVeiculos(false);
                        break;

                    case 4:
                        if(gerenciar.verificarLoja()) continue;
                        System.out.println("Veículos Vendidos:");
                        gerenciar.lojaAtual.listarVeiculos(true);
                        break;

                    case 5:
                        if(gerenciar.verificarLoja()) continue;
                        double valorEstoque = gerenciar.lojaAtual.calcularValorEstoque();
                        System.out.println("Valor total do estoque: R$" + valorEstoque);
                        break;
                    case 6:
                        gerenciar.criarLoja();
                        break;
                    case 7:
                        gerenciar.trocarLoja();
                        break;
                    case 8:
                        gerenciar.venderVeiculo();
                        break;
                    case 9:
                        System.out.println("Saindo do programa.");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }

    private void venderVeiculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a placa do veiculo");
        String placa = sc.nextLine();

        Veiculo veiculoEncontrado = lojaAtual.encontrarVeiculo(placa);

        if(veiculoEncontrado != null){
            veiculoEncontrado.setVendido(true);
            System.out.println("Veiculo vendido");
        }else{
            System.out.println("Veiculo não encontrado");
        }
    }

    public void criarMoto(Loja lojaAtual){
            Scanner sc = new Scanner(System.in);
            Moto newMoto = new Moto();

            System.out.println("Digite o modelo:");
            newMoto.setModelo(sc.nextLine());
            System.out.println("Digite a placa:");
            newMoto.setPlaca(sc.nextLine());
            System.out.println("Digite a marca");
            newMoto.setMarca(sc.nextLine());
            System.out.println("Digite o tipo de guidão");
            newMoto.setTipoGuidao(sc.nextLine());
            System.out.println("Digite o preco");
            newMoto.setPreco(Double.parseDouble(sc.nextLine()));

            lojaAtual.adicionarVeiculo(newMoto);
        }
        public void criarCarro(Loja lojaAtual){
            Scanner sc = new Scanner(System.in);

            Carro newCarro = new Carro();

            System.out.println("Digite o modelo:");
            newCarro.setModelo(sc.nextLine());
            System.out.println("Digite a placa:");
            newCarro.setPlaca(sc.nextLine());
            System.out.println("Digite a marca");
            newCarro.setMarca(sc.nextLine());
            System.out.println("Digite o tipo de combustivel");
            newCarro.setTipoCombustivel(sc.nextLine());
            System.out.println("Digite o preco");
            newCarro.setPreco(Double.parseDouble(sc.nextLine()));

            lojaAtual.adicionarVeiculo(newCarro);
        }

        public void criarLoja(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome da loja");
            Loja l = new Loja(sc.nextLine());

            listaLojas.add(l);

            if(listaLojas.size() == 1 && lojaAtual == null){
                lojaAtual = l;
            }
        }

        public void trocarLoja(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Selecione o nome da loja para buscar");
            Loja lojaProcurar = new Loja(sc.nextLine());

            if(listaLojas.contains(lojaProcurar)){
                for (Loja l: listaLojas) {
                    if(l.equals(lojaProcurar)){
                        lojaAtual = l;
                        return;
                    }
                }
            }else{
                System.out.println("Loja não encontrada");
                return;
            }
        }

        public boolean verificarLoja(){
            if(lojaAtual == null){
                System.out.println("Nenhuma loja selecionada");
                return true;
            }else{
                return  false;
            }
        }
    }