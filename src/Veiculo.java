public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double preco;

    public Veiculo(){
        this.marca = "";
        this.modelo = "";
        this.preco = 0;
    }

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

    @Override
    public String toString(){
        String objeto;

        objeto = "Marca:" + this.getModelo() + " ";
        objeto += "Modelo:" + this.getMarca() + " ";
        objeto += "Preco:" + this.getPreco();

        return objeto;
    }
}
