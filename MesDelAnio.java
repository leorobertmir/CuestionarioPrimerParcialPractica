import java.util.Scanner;

public class MesDelAnio {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner lector = new Scanner(System.in);
        int numeroMes; // Variable para guardar el número de mes que el usuario va a introducir

        
        System.out.println("Te indico el nombre del mes si me das su número, del 1 al 12.");
        
        // Paso a: Solicitar al usuario que ingrese un número de mes y validar la entrada
        while (true) {
            System.out.print("Por favor, introduce el número de un mes, escoger del 1 al 12: ");
            if (lector.hasNextInt()) {
                numeroMes = lector.nextInt();
                // Verificamos si el número está dentro del rango válido (1 al 12)
                if (numeroMes >= 1 && numeroMes <= 12) {
                    break; // Salimos del bucle si la entrada es válida
                } else {
                    System.out.println("El número debe estar entre 1 y 12.");
                }
            } else {
                System.out.println("No válido. Por favor, introduce un NÚMERO entero.");
                lector.next(); // Descarta la entrada incorrecta para evitar un bucle infinito
            }
        }

        // Cerramos el Scanner
        lector.close();

        System.out.println("\n LA RESPUESTA ES: ");

        // Paso b y c: Utilizar la sentencia "switch" para evaluar el número ingresado
        // y para cada caso, imprimir el nombre del mes.
        switch (numeroMes) {
            case 1:
                System.out.println("El mes es: ENERO");
                break; // Importante para salir del switch después de encontrar una coincidencia
            case 2:
                System.out.println("El mes es: FEBRERO");
                break;
            case 3:
                System.out.println("El mes es: MARZO");
                break;
            case 4:
                System.out.println("El mes es: ABRIL");
                break;
            case 5:
                System.out.println("El mes es: MAYO");
                break;
            case 6:
                System.out.println("El mes es: JUNIO");
                break;
            case 7:
                System.out.println("El mes es: JULIO");
                break;
            case 8:
                System.out.println("El mes es: AGOSTO");
                break;
            case 9:
                System.out.println("El mes es: SEPTIEMBRE");
                break;
            case 10:
                System.out.println("El mes es: OCTUBRE");
                break;
            case 11:
                System.out.println("El mes es: NOVIEMBRE");
                break;
            case 12:
                System.out.println("El mes es: DICIEMBRE");
                break;
            // Paso d: Si el número ingresado no se encuentra en el rango válido,
            // aunque ya lo validamos con el 'while', el 'default' sirve como una
            // última red de seguridad o para casos no previstos.
            default:
                System.out.println("Lo siento, el número de mes ingresado no es válido (debe ser del 1 al 12).");
                break;
        }

       
    }
}