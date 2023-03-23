import java.util.Scanner;
public class ejercicio14 {   
     public static void main(String[] args) {   
        Scanner tt = new Scanner(System.in);
        String [] frutas = new String [6];  
        System.out.println("bienvenido ctm >:D");
        /*String[] frutos = {"fresas","mango","papaya","uva","pera","naranja"}; */
        for(int i = 0; i< frutas.length; i++){
            System.out.println("dijite la fruta en la posicion:"+i);
            frutas[i] = tt.next();
        }
        for(int i = 0; i< frutas.length; i++){
            System.out.println("las frutas alamcenadas son: "+ frutas[i] );
        }
    }
}