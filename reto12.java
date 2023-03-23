import java.util.Scanner;

public class reto12 {
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private char sexo;
    
    //Constructor de la clase Persona
    //Método para solicitar los datos de la persona
    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipo de documento: ");
        tipoDoc = scanner.nextLine();
        System.out.print("Número de documento: ");
        documento = scanner.nextLine();
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        apellido = scanner.nextLine();
        System.out.print("Peso (kg): ");
        peso = scanner.nextDouble();
        System.out.print("Estatura (m): ");
        estatura = scanner.nextDouble();
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        System.out.print("Sexo (M/F): ");
        sexo = scanner.next().charAt(0);
    }
    
    //Método para mostrar los datos de la persona
    public void mostrarPersona(){
        System.out.println("Tipo de documento " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
    
    //Método para calcular el IMC y determinar si el peso es ideal o no
    public void calcularImc(){
        double pesoActual = peso / Math.pow(estatura, 2);
        if (pesoActual < 20){
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual >= 20 && pesoActual <= 25){
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
    }
    
    //Método para determinar si la persona es mayor de edad o no
    public void mayorEdad(){
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
