import java.util.Scanner;

public class T1_C3_Castillo{

    public static double volumen(double lado) {
        return Math.pow(lado, 3);
    }

   
    public static double volumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }


    public static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n CÁLCULO DE VOLÚMENES");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Prisma rectangular");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cubo: ");
                    double l = sc.nextDouble();
                    System.out.printf("Volumen del cubo: %.2f%n", volumen(l));
                    break;
                case 2:
                    System.out.print("Ingrese el radio del cilindro: ");
                    double r = sc.nextDouble();
                    System.out.print("Ingrese la altura del cilindro: ");
                    double h = sc.nextDouble();
                    System.out.printf("Volumen del cilindro: %.2f%n", volumen(r, h));
                    break;
                case 3:
                    System.out.print("Ingrese el largo: ");
                    double largo = sc.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    double ancho = sc.nextDouble();
                    System.out.print("Ingrese el alto: ");
                    double alto = sc.nextDouble();
                    System.out.printf("Volumen del prisma: %.2f%n", volumen(largo, ancho, alto));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}