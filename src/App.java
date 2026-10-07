import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Equipamento> lista = new ArrayList<>();

        lista.add(new Notebook("Dell", "Inspiron", 2019, true));
        lista.add(new Console("Microsoft", "Xbox One S", 2016, 1950));
        lista.add(new Smartphone("Apple", "iPhone 17", 2026, true));
        lista.add(new Console("Sony", "PlayStation 3", 2010, 3621));

        double total = 0;

        for (Equipamento e : lista) {
            System.out.println(e);
            System.out.println("Diagnóstico: " + e.diagnosticar());
            System.out.printf("Orçamento: R$ %.2f" + e.calcularOrcamento());
            total += e.calcularOrcamento();
        }
    }
}
