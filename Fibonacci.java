import java.util.Scanner; // Necesitamos esta herramienta para leer la entrada del usuario

public class Fibonacci {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in); // Creamos un objeto Scanner

        System.out.println(" Generador de la Serie de Fibonacci ");
        System.out.print("¿Cuántos números de la serie de Fibonacci deseas generar? Introduce un número entero: ");

        // Validar que la entrada sea un número entero positivo
        int n = 0;
        while (true) {
            if (lector.hasNextInt()) {
                n = lector.nextInt();
                if (n >= 0) { // Fibonacci se define para n >= 0
                    break; // Salimos del bucle si es un número entero no negativo
                } else {
                    System.out.println("Por favor, introduce un número entero no negativo.");
                }
            } else {
                System.out.println("Entrada incorrecta. Por favor, introduce un número entero.");
                lector.next(); // Descarta la entrada incorrecta
            }
            System.out.print("¿Cuántos números de la serie de Fibonacci deseas generar? (Introduce un número entero): ");
        }

        lector.close(); // Cerramos el Scanner

        System.out.println("\n Los primeros " + n + " números de la serie de Fibonacci son: ");

        // Casos especiales para n = 0, n = 1, n = 2
        if (n == 0) {
            System.out.println("No se generarán números de Fibonacci.");
        } else if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0, 1");
        } else {
            // Para n > 2
            int a = 0; // Primer número de la serie
            int b = 1; // Segundo número de la serie

            System.out.print(a + ", " + b); // Imprimimos los dos primeros números

            // Usamos un bucle for para generar el resto de los números
            // Empezamos desde i = 3 porque ya imprimimos los 2 primeros
            for (int i = 3; i <= n; i++) {
                int siguienteNumero = a + b; // Calculamos el siguiente número
                System.out.print(", " + siguienteNumero); // Imprimimos el siguiente número

                // Actualizamos 'a' y 'b' para la siguiente iteración
                a = b;
                b = siguienteNumero;
            }
            System.out.println(); // Salto de línea al final
        }
        System.out.println("FIN");
    }
}