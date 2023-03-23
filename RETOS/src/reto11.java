import java.util.Scanner;

public class reto11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = input.nextInt();
        

        double[] notas = new double[cantidadNotas];
        
        // Pedir al usuario el valor de cada nota y almacenarla 
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = input.nextDouble();
        }
        
        // Calcular el promedio de las notas
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / cantidadNotas;
        
        System.out.printf("El promedio de las notas es %.2f\n", promedio);
        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio < 4) {
            System.out.println("Pasaste Raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
        
        input.close();
    }
}
