public class Notebook extends Equipamento {
    private boolean precisaTrocarTela;

    public Notebook(String marca, String modelo, int anoFabricacao, boolean precisaTrocarTela) {
        super(marca, modelo, anoFabricacao);
        this.precisaTrocarTela = precisaTrocarTela;
    }

    @Override
    public String diagnosticar() {
        if (precisaTrocarTela) {
            return "Tela danificada, precisa de troca";
        }
        return "Diagnóstico: Bateria viciada ou superaquecimento";
    }

    @Override
    public double calcularOrcamento() {
        if (precisaTrocarTela) {
            return 150.0 + 400.0;
        } else {
            return 150.0;
        }
    }
}