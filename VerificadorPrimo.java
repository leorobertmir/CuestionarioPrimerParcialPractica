import java.util.Scanner; // Necesitamos esta herramienta para leer la entrada del usuario

public class VerificadorPrimo {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner lector = new Scanner(System.in);
        int numero; // Variable para guardar el número que el usuario va a introducir

        System.out.println("Programa Verificador de Números Primos ");
        System.out.println("Te diré si un número entero ingresado por ti es primo o no.");
        

        // 1. Solicitar al usuario que ingrese un número entero y validarlo
        while (true) {
            System.out.print("Por favor, digita un número entero positivo: ");
            if (lector.hasNextInt()) {
                numero = lector.nextInt();
                if (numero >= 0) { // Solo consideramos números enteros no negativos para la primalidad
                    break; // Salimos del bucle si la entrada es un entero no negativo
                } else {
                    System.out.println("Hay un Error. Por favor, digita un número entero POSITIVO.");
                }
            } else {
                System.out.println("Entrada incorrecta. Por favor, digita solo NÚMEROS enteros.");
                lector.next(); // Descarta la entrada incorrecta
            }
        }

        // Cerramos el Scanner.
        lector.close();

        // 2. Determinar si el número es primo o no
        // Los casos especiales para números primos son 0, 1 y 2
        if (numero < 2) { // Números menores que 2 (0 y 1) NO son primos por definición
            System.out.println("El número " + numero + " NO es un número primo.");
        } else if (numero == 2) { // El 2 es el único número par que es primo
            System.out.println("El número " + numero + " SÍ es un número primo.");
        } else {
            // Para números mayores que 2, necesitamos verificar sus divisores
            boolean esPrimo = true; // Asumimos que el número es primo inicialmente

            // Bucle para verificar divisibilidad desde 2.
            
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) { // Si el número es divisible por 'i' (sin residuo)
                    esPrimo = false; // Entonces NO es primo
                    break; // Salimos del bucle tan pronto como encontramos un divisor
                }
            }

            // 3. Imprimir el mensaje adecuado según el resultado
            if (esPrimo) {
                System.out.println("El número " + numero + " SÍ es un número primo.");
            } else {
                System.out.println("El número " + numero + " NO es un número primo.");
            }
        }

        
    }
}