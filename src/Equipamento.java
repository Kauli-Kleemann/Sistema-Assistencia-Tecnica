public abstract class Equipamento implements Diagnosticavel {
    private String marca;
    private String modelo; 
    private int anoFabricacao;

    public Equipamento(String marca, String modelo, int anoFabricacao) {
        this.marca = marca; 
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    
}