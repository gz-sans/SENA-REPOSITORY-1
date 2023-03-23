import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, necesitas una cédula de ciudadanía.");
        } else {
            System.out.println("Eres menor de edad, necesitas una tarjeta de identidad.");
        }
        
        input.close();
    }

}
