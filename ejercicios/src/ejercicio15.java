import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner tt = new Scanner(System.in);
        System.out.println("antes de nada este programa no se encarga si da respuestas ofensivas porfavor disfrute :D");
        System.out.println("cuantas edades quiere dijitar");
        int ttv = tt.nextInt();
        int [] edad = new int[ttv]; 
        
        for (int i=0; i < edad.length; i++) {
            System.out.println("ingrese las edades:" + (i+1)+ ":");
            edad[i] = tt.nextInt(); 
        }
        int suma = 0; 
        for (int i=0; i < edad.length; i++) {
            suma += edad[i]; 
        }
        
        int promedio = suma / edad.length; 
        
        String clasificacion = ""; //declaramos una variable vacía

                if (promedio >= 0 && promedio < 10) {
                    clasificacion = "BEBE"; 
                } else if (promedio >= 10 && promedio < 18) {
                    clasificacion = "niño";
                } else if (promedio >= 18 && promedio < 25 ) {
                    clasificacion = "ADULTO";
                } else if (promedio >= 25) {
                    clasificacion = "VIEJO";
                }

                System.out.println("usted tiene "+ promedio + " años de promedio y es un " + clasificacion); 
            }
        }