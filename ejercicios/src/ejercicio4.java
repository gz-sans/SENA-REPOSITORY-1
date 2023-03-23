import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Declaramos las variables
        int producto1, producto2, producto3, producto4, producto5, total;
        
        // 2. Creamos el objeto Scanner para solicitar los valores de los productos
        Scanner scannerProductos = new Scanner(System.in);
        
        // 3. Solicitamos los valores de los productos
        System.out.print("Ingrese el valor del primer producto: ");
        producto1 = scannerProductos.nextInt();
        System.out.print("Ingrese el valor del segundo producto: ");
        producto2 = scannerProductos.nextInt();
        System.out.print("Ingrese el valor del tercer producto: ");
        producto3 = scannerProductos.nextInt();
        System.out.print("Ingrese el valor del cuarto producto: ");
        producto4 = scannerProductos.nextInt();
        System.out.print("Ingrese el valor del quinto producto: ");
        producto5 = scannerProductos.nextInt();
        
        // 4. Capturamos los valores de los productos y realizamos la operación de suma
        total = producto1 + producto2 + producto3 + producto4 + producto5;
        
        // 5. Imprimimos el valor total de la lista de mercado
        System.out.println("El valor total de la lista de mercado es: " + total);
        
        // 6. Cerramos el objeto scannerProductos
        scannerProductos.close();
        
        scanner.close();
    }
}