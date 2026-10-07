public abstract class Equipamento implements Diagnosticavel {
    private String marca;
    private String modelo; 
    private int anoFabricacao;

    public Equipamento(String marca, String modelo, int anoFabricacao) {
        this.marca = marca; 
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getMarca() + " " + getModelo() + " (" + getAnoFabricacao() + ")";
    }
}