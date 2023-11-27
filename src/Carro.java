public class Carro extends Veiculo{
    private String tipoCombustivel;

    public Carro(){
        super();
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        String objeto;

        objeto = "Placa: " + this.getPlaca() + "\n";
        objeto += "Marca:" + this.getModelo() + "\n";
        objeto += "Modelo:" + this.getMarca() + "\n";
        objeto += "Preco:" + this.getPreco() + "\n";
        objeto += "Tipo Combustivel: " + this.getTipoCombustivel() + "\n";

        return objeto;
    }
}
