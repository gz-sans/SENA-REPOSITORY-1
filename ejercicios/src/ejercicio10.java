import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int precioBola = 1000; // Precio de una bola de helado
        
        System.out.print("¿Cuántas bolas de helado deseas comprar? ");
        int bolas = input.nextInt();
        
        int total = bolas * precioBola; // Cálculo del costo total
        
        System.out.println("El costo total de " + bolas + " bola(s) de helado es: " + total + " pesos.");
        
        for (;;) { // Ciclo infinito para agregar más bolas de helado
            System.out.print("¿Deseas agregar más bolas de helado? (S/N) ");
            String respuesta = input.next();
            
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.print("¿Cuántas bolas de helado deseas agregar? ");
                int bolasExtra = input.nextInt();
                
                total += bolasExtra * precioBola; // Suma del costo adicional al total
                
                System.out.println("El costo total de " + (bolas + bolasExtra) + " bola(s) de helado es: " + total + " pesos.");
            } else if (respuesta.equalsIgnoreCase("N")) {
                break; // Terminación del ciclo si la respuesta es "N"
            } else {
                System.out.println("Respuesta inválida. Por favor, responda con 'S' o 'N'."); // Mensaje de error para respuestas inválidas
            }
        }
        
        System.out.println("El costo total de " + bolas + " bola(s) de helado es: " + total + " pesos."); // Impresión del costo total final
        
        input.close();
    }

}
