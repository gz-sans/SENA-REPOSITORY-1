import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorTotal = 0;
        int valorLlantas = 1500;
        int valorMotor = 2000;
        int valorPintura = 2500;
        int valorGolpes = 3000;

        System.out.println("Bienvenido al programa para calcular el valor de arreglo de un carro.\n");

        System.out.println("¿El carro tiene daño en las llantas? (S/N)");
        String respuesta = input.next();
        valorTotal += respuesta.equalsIgnoreCase("S") ? valorLlantas : 0;

        System.out.println("¿El carro tiene daño en el motor? (S/N)");
        respuesta = input.next();
        valorTotal += respuesta.equalsIgnoreCase("S") ? valorMotor : 0;

        System.out.println("¿El carro tiene daño en la pintura? (S/N)");
        respuesta = input.next();
        valorTotal += respuesta.equalsIgnoreCase("S") ? valorPintura : 0;

        System.out.println("¿El carro tiene daño en los golpes? (S/N)");
        respuesta = input.next();
        valorTotal += respuesta.equalsIgnoreCase("S") ? valorGolpes : 0;

        System.out.println("\nEl valor total de arreglo del carro es: $" + valorTotal);
    }
}
