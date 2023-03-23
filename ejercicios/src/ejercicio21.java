import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    int fila = 2;
    System.out.println("hola");
    int columnas =2;
    System.out.println("hola X2 ");
    String [] [] vocal = new String [2] [2];
    for (int i = 0; i < fila; i++) {
        for (int j = 0; j < columnas; j++) {
        System.out.println("Escriba la vocal a en la picicion"+ i +":"+ j );
        vocal [i][j] = lectura.next();
        }
    } 
    System.out.println("aaqui esta la fila");

    for (int i = 0; i < fila ; i++) {
        for (int j = 0; j < fila; j++) {
            System.out.print(vocal [i][j] +"\t");
        }System.out.println();
    }
    
    }    
}