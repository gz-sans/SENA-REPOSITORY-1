import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el nombre y la edad del animal
        System.out.print("Introduce el nombre del animal: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la edad del animal: ");
        int edad = sc.nextInt();

        // Calcula el peso del animal utilizando la fórmula
        int peso = edad * 50;

        // Muestra el resultado en la consola
        System.out.println("El animal " + nombre + " tiene " + edad + " años y su peso es de " + peso + " kg.");
    }
}