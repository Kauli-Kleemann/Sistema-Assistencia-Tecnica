public class Console extends Equipamento {
    private int horasDeUso;

    public Console(String marca, String modelo, int anoFabricacao, int horasDeUso) {
        super(marca, modelo, anoFabricacao);
        this.horasDeUso = horasDeUso;
    }
}