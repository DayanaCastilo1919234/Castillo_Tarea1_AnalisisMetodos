import java.util.Scanner;

public class T1_C1_Castillo {

    public static double leerConsumo(Scanner sc) {
        double m3;
        do {
            System.out.print("Ingrese el consumo de agua en m3 (>= 0): ");
            m3 = sc.nextDouble();
            if (m3 < 0) {
                System.out.println("Error: El consumo no puede ser negativo.");
            }
        } while (m3 < 0);
        return m3;
    }

    public static double calcularValor(double m3) {
        double cargoFijo = 2.50;
        double valorConsumo;
        if (m3 <= 15) {
            valorConsumo = m3 * 0.40;
        } else {
            double exceso = m3 - 15;
            valorConsumo = (15 * 0.40) + (exceso * 0.75);
        }
        return cargoFijo + valorConsumo;
    }

    public static void mostrarPlanilla(double m3, double total) {
        System.out.println("PLANILLA DE AGUA");
        System.out.printf("Consumo registrado: %.2f m3%n", m3);
        System.out.printf("Total a pagar: $%.2f%n", total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo = leerConsumo(sc);
        double totalPagar = calcularValor(consumo);
        mostrarPlanilla(consumo, totalPagar);
        sc.close();
    }
}