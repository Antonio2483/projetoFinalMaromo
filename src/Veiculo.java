import java.util.Objects;
//Declaração da classe abstrata
public abstract class Veiculo {
    //Declaração das variaveis
    private String marca;
    private String modelo;
    private double preco;

    private String placa;

    private Boolean vendido;

    public Veiculo(){
        this.marca = "";
        this.modelo = "";
        this.preco = 0;
        this.placa = "";
        this.vendido = false;
    }

    //Gets e Sets

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Boolean getVendido() {
        return vendido;
    }

    public void setVendido(Boolean vendido) {
        this.vendido = vendido;
    }

    @Override
    public int hashCode() {
        return modelo.length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placa, veiculo.placa);
    }

    //Escrita do método toString
    @Override
    public String toString(){
        String objeto;

        objeto = "Marca:" + this.getModelo() + " ";
        objeto += "Modelo:" + this.getMarca() + " ";
        objeto += "Preco:" + this.getPreco() + " ";
        objeto += "Placa:" + this.getPlaca() + " ";
        objeto += "Vendido?: " + (this.getVendido() ? "Sim" : "Não");

        return objeto;
    }
    //Booleano para confirmar a placa encontrada

    public boolean isPlaca(String placa){
        if(placa.equals(this.placa)){
            return true;
        }else{
            return false;
        }
    }
}
