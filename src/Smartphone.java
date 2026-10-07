public class Smartphone extends Equipamento {
    private boolean temGarantia;

    public Smartphone(String marca, String modelo, int anoFabricacao, boolean temGarantia) {
        super(marca, modelo, anoFabricacao);
        this.temGarantia = temGarantia;
    }
}