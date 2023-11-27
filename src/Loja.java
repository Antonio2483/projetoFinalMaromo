import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Loja {

    private String nomeLoja;
    private List<Veiculo> listaVeiculos;

    public Loja(String nomeLoja){
        this.nomeLoja = nomeLoja;
        this.listaVeiculos = new ArrayList<>();
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public void adicionarVeiculo(Veiculo newVeiculo){

        Veiculo repetido = this.encontrarVeiculo(newVeiculo.getPlaca());

        if(repetido != null){
            System.out.println("Já existe um veículo com essa placa na concessionária");
        }else{
            this.listaVeiculos.add(newVeiculo);
            System.out.println("");
        }
    }

    public void removerVeiculo(Veiculo veiculoRemover){

        if(veiculoRemover != null){
            this.listaVeiculos.remove(veiculoRemover);
        }else{
            System.out.println("Veículo não encontrado");
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

    public Veiculo encontrarVeiculo(String placa){

        // gambiarrinha
        boolean achou = false;
        Veiculo veiculoAchado = null;
        for (Veiculo v: listaVeiculos) {
            if(v.isPlaca(placa)){
                veiculoAchado = v;
            }
        }
        return veiculoAchado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loja loja = (Loja) o;
        return Objects.equals(nomeLoja, loja.nomeLoja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeLoja);
    }
}
