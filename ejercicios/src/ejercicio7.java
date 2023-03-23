import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el número del mes de tu nacimiento (1-12): ");
        int mes = input.nextInt();

        System.out.print("Ingresa el día de tu nacimiento: ");
        int dia = input.nextInt();

        String signo = "";

        switch(mes) {
            case 1: // Enero
                if (dia <= 20) {
                    signo = "Capricornio";
                    System.out.println("Eres una persona ambiciosa, trabajadora y responsable.");
                } else {
                    signo = "Acuario";
                    System.out.println("Eres una persona independiente, creativa y humanitaria.");
                }
                break;
            case 2: // Febrero
                if (dia <= 19) {
                    signo = "Acuario";
                    System.out.println("Eres una persona independiente, creativa y humanitaria.");
                } else {
                    signo = "Piscis";
                    System.out.println("Eres una persona compasiva, imaginativa y sensible.");
                }
                break;
            case 3: // Marzo
                if (dia <= 20) {
                    signo = "Piscis";
                    System.out.println("Eres una persona compasiva, imaginativa y sensible.");
                } else {
                    signo = "Aries";
                    System.out.println("Eres una persona enérgica, valiente y apasionada.");
                }
                break;
            case 4: // Abril
                if (dia <= 20) {
                    signo = "Aries";
                    System.out.println("Eres una persona enérgica, valiente y apasionada.");
                } else {
                    signo = "Tauro";
                    System.out.println("Eres una persona enérgica, valiente y apasionada.");
                }
                break;
            case 5: // Mayo
                if (dia <= 21) {
                    signo = "Tauro";
                    System.out.println("Eres una persona enérgica, valiente y apasionada.");
                } else {
                    signo = "Géminis";
                    System.out.println("Eres una persona versátil, curiosa y comunicativa.");
                }
                break;
            case 6: // Junio
                if (dia <= 21) {
                    signo = "Géminis";
                    System.out.println("Eres una persona versátil, curiosa y comunicativa.");
                } else {
                    signo = "Cáncer";
                    System.out.println("Eres una persona emocional, sensible y protectora.");
                }
                break;
            case 7: // Julio
                if (dia <= 22) {
                    signo = "Cáncer";
                    System.out.println("Eres una persona emocional, sensible y protectora.");
                } else {
                    signo = "Leo";
                    System.out.println("Eres una persona confiada, creativa y apasionada.");
                }
                break;
            case 8: // Agosto
                if (dia <= 23) {
                    signo = "Leo";
                    System.out.println("Eres una persona confiada, creativa y apasionada.");
                } else {
                    signo = "Virgo";
                    System.out.println("Eres una persona práctica, analítica y perfeccionista.");
                }
                break;
            case 9: // Septiembre
                if (dia <= 23) {
                    signo = "Virgo";
                    System.out.println("Eres una persona práctica, analítica y perfeccionista.");
                } else {
                    signo = "Libra";
                    System.out.println("sos el mejor signo,Eres una persona equilibrada, amante de la armonía y la justicia.");
                }
                break;
            case 10: // Octubre
                if (dia <= 23) {
                    signo = "Libra";
                    System.out.println("sos el mejor signo,Eres una persona equilibrada, amante de la armonía y la justicia.");
                } else {
                    signo = "Escorpio";
                    System.out.println("Eres una persona equilibrada, amante de la armonía y la justicia.");
                }
                break;
            case 11: // Noviembre
                if (dia <= 22) {
                    signo = "Escorpio";
                    System.out.println("Eres una persona equilibrada, amante de la armonía y la justicia.");
                } else {
                    signo = "Sagitario";
                    System.out.println("Eres una persona equilibrada, amante de la armonía y la justicia.");
                }
                break;
            case 12: // Diciembre
                if (dia <= 21) {
                    signo = "Sagitario";
                    System.out.println("Eres una persona equilibrada, amante de la armonía y la justicia.");
                } else {
                    signo = "Capricornio";
                    System.out.println("Eres una persona ambiciosa, trabajadora y responsable.");
                }
                break;
            default:
                System.out.println("El mes ingresado es inválido.");
                System.exit(0);
        }

        System.out.println("Tu signo zodiacal es " + signo + ".");

        // Muestra las características del signo zodiacal
        switch(signo) {
            case "Capricornio":
                System.out.println("Características de Capricornio: Ambicioso, realista, paciente y disciplinado.");
                break;
        }          
    }
}