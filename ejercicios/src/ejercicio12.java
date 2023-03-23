import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        
        // Datos de los usuarios
        String usuario1 = "Juan camilo";
        String usuario2 = "erismar mendoza";
        String usuario3 = "duvan rodrigez";
        String usuario4 = "ruben mendoza";
        int vacunas1 = 1; 
        int vacunas2 = 0;
        int vacunas3 = 2;
        int vacunas4 = 3;
        
        // Autenticación de usuario                                               
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su número de documento: ");
        int documento = scanner.nextInt();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.next();
        
        // Verificación de usuario y contraseña
        int usuarioIndex = verificarUsuario(documento, contraseña);
        if(usuarioIndex == -1) {
            System.out.println("Usuario o contraseña incorrectos");
        } else {
            // Verificación de vacunas
            verificarVacunas(usuarioIndex, vacunas1, vacunas2, vacunas3, vacunas4);
        }
    }
    
    // Función para verificar el usuario y la contraseña(contraseña misma que documento)
    public static int verificarUsuario(int documento, String contraseña) {
        int usuarioIndex = -1;
        if(documento == 12345 && contraseña.equals("12345")) {
            usuarioIndex = 0;
        } else if(documento == 123456 && contraseña.equals("123456")) {
            usuarioIndex = 1;
        } else if(documento == 1234 && contraseña.equals("1234")) {
            usuarioIndex = 2;
        } else if(documento == 123 && contraseña.equals("123")) {
            usuarioIndex = 3;
        }
        return usuarioIndex;
    }
    
    // Función para verificar las vacunas aplicadas tt
    public static void verificarVacunas(int usuarioIndex, int vacunas1, int vacunas2, int vacunas3, int vacunas4) {
        if(usuarioIndex == 0 && vacunas1 == 1) {
            System.out.println("usted es juan camilo y ha recibido la primera vacuna");
        } else if(usuarioIndex == 1 && vacunas2 == 0) {
            System.out.println("usted es erismar mendoza y no ha recibido ninguna de las tres vacunas");
        } else if(usuarioIndex == 2 && vacunas3 == 2) {
            System.out.println("usted es duvan rodrigez y ha recibido las dos primeras vacunas, pero no la tercera");
        } else if(usuarioIndex == 3 && vacunas4 == 3) {
            System.out.println("usted esruben mendoza y ha recibido las tres vacunas");
        } else {
            System.out.println("Este usuario ha recibido una cantidad de vacunas no válida");
        }
    }
}
