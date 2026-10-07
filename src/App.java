import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Equipamento> lista = new ArrayList<>();

        lista.add(new Notebook("Dell", "Inspiron", 2019, true));
        lista.add(new Console("Microsoft", "Xbox One S", 2016, 1950));
        lista.add(new Smartphone("Apple", "iPhone 17", 2026, true));
        lista.add(new Console("Sony", "PlayStation 3", 2010, 3621));

        double total = 0;
        String equipamentoMaisCaro = "";
        double valorMaisCaro = -1;

        for (Equipamento e : lista) {
            System.out.println(e);
            System.out.println("Diagnóstico: " + e.diagnosticar());
            System.out.printf("Orçamento: R$ %.2f%n", e.calcularOrcamento());

            if (e.calcularOrcamento() > valorMaisCaro) {
               valorMaisCaro = e.calcularOrcamento();
               equipamentoMaisCaro = e.toString();
            }

            total += e.calcularOrcamento();

            System.out.println("\n");
        }

        System.out.printf("Valor total de todos os equipamentos: R$ %.2f%n", total);
        System.out.println("Equipamento com o orçamento mais alto: " + equipamentoMaisCaro);
    }
}
