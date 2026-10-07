public class Console extends Equipamento {
    private int horasDeUso;

    public Console(String marca, String modelo, int anoFabricacao, int horasDeUso) {
        super(marca, modelo, anoFabricacao);
        this.horasDeUso = horasDeUso;
    }

    @Override
    public String diagnosticar() {
        if (horasDeUso > 2000) {
            return "Limpeza pesada e troca de pasta térmica";
        } else {
            return "Superaquecimento ou HD com falha";
        }
    }

    @Override
    public double calcularOrcamento() {
        if (horasDeUso > 2000) {
            return 120.0 + 80.0;
        } else {
            return 120.0;
        }
    }
}