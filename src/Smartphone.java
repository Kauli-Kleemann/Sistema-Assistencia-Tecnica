public class Smartphone extends Equipamento {
    private boolean temGarantia;

    public Smartphone(String marca, String modelo, int anoFabricacao, boolean temGarantia) {
        super(marca, modelo, anoFabricacao);
        this.temGarantia = temGarantia;
    }

    @Override
    public String diagnosticar() {
        if (temGarantia) {
            return "O equipamento possui garantia";
        } else {
            "Lentidão e falhas no carregamento";
        }
    }

    
}