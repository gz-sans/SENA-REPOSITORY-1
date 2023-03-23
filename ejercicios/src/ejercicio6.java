import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        // Declarar la variable 
        Scanner scanner;
        
        // Crear objeto scanner
        scanner = new Scanner(System.in);
        
        // Solicitar datos
        System.out.print("Ingrese el nombre del color: ");
        
        // Captura de datos
        String color = scanner.nextLine().toLowerCase();
        
        // Hacer operaciones
        if (color.equals("rojo")) {
            System.out.println("El color ingresado es un color primario.");
        } else if (color.equals("amarillo")) {
            System.out.println("El color ingresado es un color primario.");
        } else if (color.equals("azul")) {
            System.out.println("El color ingresado es un color primario.");
        } else {
            System.out.println("El color ingresado no es un color primario.");
        }
        
        //Imprimir resultados 
        scanner.close();
    }
}
