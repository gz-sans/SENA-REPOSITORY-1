import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        //declarar variables
        int numero, resto;
        String mensaje;
        //instanciar las clases
        Scanner sc = new Scanner(System.in);
        //solicitar datos
        System.out.print("Por favor ingresa un número: ");
        //caprura de datos
        numero = sc.nextInt();
        //hacer operaciones
        resto = numero % 3;
        //imprimir resultado
        mensaje = (resto == 0) ? "El número ingresado es múltiplo de 3." : "El número ingresado no es múltiplo de 3.";
        System.out.println(mensaje);
    }
}