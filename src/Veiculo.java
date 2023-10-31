public abstract class Veiculo {
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
    public String toString(){
        String objeto;

        objeto = "Marca:" + this.getModelo() + " ";
        objeto += "Modelo:" + this.getMarca() + " ";
        objeto += "Preco:" + this.getPreco() + " ";
        objeto += "Placa:" + this.getPlaca() + " ";
        objeto += "Vendido?: " + (this.getVendido() ? "Sim" : "Não");

        return objeto;
    }
}
