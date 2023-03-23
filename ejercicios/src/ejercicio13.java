import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota5;
        System.out.println("Ingrese la nota del taller 1: ");
        nota1 = scanner.nextDouble();
        System.out.println("Ingrese la nota del taller 2: ");
        nota2 = scanner.nextDouble();
        System.out.println("Ingrese la nota del taller 3: ");
        nota3 = scanner.nextDouble();
        System.out.println("Ingrese la nota del taller 4: ");
        nota4 = scanner.nextDouble();
        System.out.println("Ingrese la nota del taller 5: ");
        nota5 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        int estrellas = 0;
        if (promedio >= 0 && promedio <= 10) {
            estrellas = 0;
        } else if (promedio <= 20) {
            estrellas = 1;
        } else if (promedio <= 40) {
            estrellas = 2;
        } else if (promedio <= 60) {
            estrellas = 3;
        } else if (promedio <= 80) {
            estrellas = 4;
        } else if (promedio <= 100) {
            estrellas = 5;
        } else {
            estrellas = -1;
        }
        System.out.println("El promedio de las notas es " + promedio + " y se le otorgan " + estrellas + " estrellas.");
    }
}
