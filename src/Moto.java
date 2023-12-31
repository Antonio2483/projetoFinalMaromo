public class Moto extends Veiculo{
    //Declaração das variaveis
    String tipoGuidao;
    public Moto(){
        super();
    }

    //Gets e Sets

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    //Declaração do método toString
    @Override
    public String toString() {
        String objeto;

        objeto = "Placa: " + this.getPlaca() + "\n";
        objeto += "Marca:" + this.getModelo() + "\n";
        objeto += "Modelo:" + this.getMarca() + "\n";
        objeto += "Preco:" + this.getPreco() + "\n";
        objeto += "Tipo Guadão: " + this.getTipoGuidao() + "\n";

        return objeto;
    }
}
