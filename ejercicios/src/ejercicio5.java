import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("para esto se nesesitara el administrador de tareas.\n");
        System.out.println("¿Cuál es el estado de su equipo?\n");
        String estado = scanner.nextLine();
        
        System.out.println("¿Cuál es la temperatura del equipo?\n");
        double temperatura = scanner.nextDouble();
        
        System.out.println("¿Cuál es el uso de CPU actual?\n");
        int usoCPU = scanner.nextInt();
        
        // Aquí puede agregar cualquier otra pregunta relevante que desee hacer al usuario
        
        // Procesar la información ingresada por el usuario
        System.out.println("El estado del equipo es: " + estado);
        System.out.println("La temperatura actual del equipo es: " + temperatura + " grados Celsius");
        System.out.println("El uso actual de la CPU es: " + usoCPU + "%");
        
        // Aquí puede agregar cualquier otra acción que desee que el programa realice, como enviar una notificación al usuario si la temperatura del equipo es demasiado alta, por ejemplo.
        
    }
}
