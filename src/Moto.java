public class Moto extends Veiculo{
    String tipoGuidao;
    public Moto(){
        super();
    }

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public String toString() {
        String objeto;

        objeto = "Marca:" + this.getModelo() + " ";
        objeto += "Modelo:" + this.getMarca() + " ";
        objeto += "Preco:" + this.getPreco() + " ";
        objeto += "Tipo Combustivel" + this.getTipoGuidao();

        return objeto;
    }
}
