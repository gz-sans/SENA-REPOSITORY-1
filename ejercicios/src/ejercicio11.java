import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1, num2, num3, resultado;
    char operacion;

    System.out.println("Ingrese el primer número:");
    num1 = scanner.nextInt();

    System.out.println("Ingrese el segundo número:");
    num2 = scanner.nextInt();

    System.out.println("Ingrese el tercer número:");
    num3 = scanner.nextInt();

    System.out.println("Ingrese la operación que desea realizar (+, -, *, /):");
    operacion = scanner.next().charAt(0);

    if (operacion == '+') {
      resultado = num1 + num2 + num3;
      System.out.println("El resultado de la suma es: " + resultado);
    } else if (operacion == '-') {
      resultado = num1 - num2 - num3;
      System.out.println("El resultado de la resta es: " + resultado);
    } else if (operacion == '*') {
      resultado = num1 * num2 * num3;
      System.out.println("El resultado de la multiplicación es: " + resultado);
    } else if (operacion == '/') {
      resultado = num1 / num2 / num3;
      System.out.println("El resultado de la división es: " + resultado);
    } else {
      System.out.println("Operación no válida.");
    }
  }
}
