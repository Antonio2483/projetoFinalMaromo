import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nomeLoja;
    private List<Veiculo> listaVeiculos;

    public Loja(String nomeLoja){
        this.nomeLoja = nomeLoja;
        this.listaVeiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo newVeiculo){
        Boolean repetido = false;
        for (Veiculo v: this.listaVeiculos) {
            if(v.getPlaca() == newVeiculo.getPlaca()){
                repetido = true;
            }
        }

        if(repetido){
            System.out.println("Já existe um veículo com essa placa na concessionária");
        }else{
            this.listaVeiculos.add(newVeiculo);
        }
    }

    public void removerVeiculo(String placa){
        Veiculo veiculoAchado = null;
        boolean achou = false;

        for (Veiculo v: this.listaVeiculos) {
            if(v.getPlaca() == placa){
                veiculoAchado = v;
                achou = true;
            }
        }

        if(achou){
            this.listaVeiculos.remove(veiculoAchado);
        }

    }

    public void listarVeiculos(){
        for (Veiculo v: this.listaVeiculos) {
            System.out.println("----------------");
            System.out.println(v.toString());
            System.out.println("----------------");
        }
    }

    public void listarVeiculos(Boolean vendido){
        for (Veiculo v: this.listaVeiculos) {
            if(v.getVendido() == vendido){
                System.out.println("----------------");
                System.out.println(v.toString());
                System.out.println("----------------");
            }
        }
    }

    public double calcularValorEstoque(){
        double valorTotal = 0;

        for (Veiculo v: this.listaVeiculos) {
            if(!v.getVendido()){
                valorTotal += v.getPreco();
            }
        }
        return valorTotal;
    }
}
