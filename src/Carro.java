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
    public String toString() {
        String objeto;

        objeto = "Marca:" + this.getModelo() + " ";
        objeto += "Modelo:" + this.getMarca() + " ";
        objeto += "Preco:" + this.getPreco() + " ";
        objeto += "Tipo Combustivel" + this.getTipoCombustivel();

        return objeto;
    }
}
