import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        // 1. Declaramos las variables
        int hijo1, hijo2, hijo3, mayor, mediano, pequeño;
        Scanner scanner = new Scanner(System.in);
        
        // 2. Creamos el objeto Scanner
        
        // 3. Solicitamos las edades de los tres hijos al usuario
        System.out.print("Ingrese la edad del primer hijo: ");
        
        // 4. Capturamos los datos ingresados por el usuario
        hijo1 = scanner.nextInt();
        
        System.out.print("Ingrese la edad del segundo hijo: ");
        hijo2 = scanner.nextInt();
        
        System.out.print("Ingrese la edad del tercer hijo: ");
        hijo3 = scanner.nextInt();
        
        // 5. Realizamos las operaciones 
        if(hijo1 > hijo2 && hijo1 > hijo3) {
            mayor = hijo1;
            if(hijo2 > hijo3) {
                mediano = hijo2;
                pequeño = hijo3;
            } else {
                mediano = hijo3;
                pequeño = hijo2;
            }
        } else if(hijo2 > hijo1 && hijo2 > hijo3) {
            mayor = hijo2;
            if(hijo1 > hijo3) {
                mediano = hijo1;
                pequeño = hijo3;
            } else {
                mediano = hijo3;
                pequeño = hijo1;
            }
        } else {
            mayor = hijo3;
            if(hijo1 > hijo2) {
                mediano = hijo1;
                pequeño = hijo2;
            } else {
                mediano = hijo2;
                pequeño = hijo1;
            }
        }
        
        // 6. Imprimimos los resultados
        System.out.println("El mayor tiene " + mayor + " años");
        System.out.println("El mediano tiene " + mediano + " años");
        System.out.println("El pequeño tiene " + pequeño + " años");

    }

}
