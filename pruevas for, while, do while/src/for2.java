import java.util.Scanner;

public class for2
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] signos = {"Capricornio", "Acuario", "Piscis", "Aries", "Tauro", "Géminis", "Cáncer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario"};
        
        String[] caracteristicas = {"Eres una persona ambiciosa, trabajadora y responsable.", 
                                    "Eres una persona independiente, creativa y humanitaria.", 
                                    "Eres una persona compasiva, imaginativa y sensible.", 
                                    "Eres una persona enérgica, valiente y apasionada.", 
                                    "Eres una persona enérgica, valiente y apasionada.", 
                                    "Eres una persona versátil, curiosa y comunicativa.", 
                                    "Eres una persona emocional, sensible y protectora.", 
                                    "Eres una persona confiada, creativa y apasionada.", 
                                    "Eres una persona práctica, analítica y perfeccionista.", 
                                    "Eres una persona equilibrada, amante de la armonía y la justicia.", 
                                    "Eres una persona equilibrada, amante de la armonía y la justicia.", 
                                    "Eres una persona equilibrada, amante de la armonía y la justicia."};
        
        System.out.print("Ingresa el número del mes de tu nacimiento (1-12): ");
        int mes = input.nextInt();

        System.out.print("Ingresa el día de tu nacimiento: ");
        int dia = input.nextInt();

        String signo = "";

        for (int i = 0; i < signos.length; i++) {
            if ((mes - 1) % 12 == i && dia <= diaFinSigno[i]) {
                signo = signos[i];
                System.out.println(caracteristicas[i]);
                break;
            }
        }

        System.out.println("Tu signo zodiacal es " + signo + ".");
    }
    
    // Días finales de cada signo zodiacal (del 1 al 12)
    public static final int[] diaFinSigno = {20, 18, 20, 19, 20, 20, 22, 23, 23, 23, 22, 21};
}