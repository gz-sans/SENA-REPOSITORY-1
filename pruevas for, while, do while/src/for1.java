import java.util.Scanner;

public class for1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] n = new double[5]; // crear un arreglo para almacenar las notas

        for (int i = 0; i < n.length; i++) {
            System.out.println("Ingrese la nota del taller " + (i+1) + ": ");
            n[i] = scanner.nextDouble(); // almacenar la nota ingresada en el arreglo
        }

        double promedio = (n[0] + n[1] + n[2] + n[3] + n[4]) / 5;
        int estrellas = 0;
        if (promedio >= -100 && promedio <= 10) {
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
