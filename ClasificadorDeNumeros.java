import java.util.Scanner; // 

public class ClasificadorDeNumeros {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner lector = new Scanner(System.in);
        double numero; // Usamos 'double' para permitir números con decimales, no solo enteros

        
        System.out.println("Averigua si tu número es positivo, negativo o cero.");
        

        // Paso 1: Pedir al usuario que introduzca un número
        System.out.print("digita un número cualquiera: ");

        // Paso 2: Validar la entrada para asegurarnos de que sea un número
        while (!lector.hasNextDouble()) {
            System.out.println("número no válido.");
            System.out.print("Intenta de nuevo y digita un número: ");
            lector.next(); // Descarta la entrada incorrecta para evitar un bucle infinito
        }
        numero = lector.nextDouble(); // Leer el número introducido por el usuario

        // Paso 3: Clasificar el número usando condicionales (if-else if-else)
        if (numero > 0) {
            System.out.println("\n Tu número " + numero + " es POSITIVO, es mayor que cero.");
        } else if (numero < 0) {
            System.out.println("\n Tu número " + numero + " es NEGATIVO, es menor que cero.");
        } else { // Si no es mayor que cero ni menor que cero, solo puede ser cero
            System.out.println("\n Tu número " + numero + " es CERO.");
        }

        // Paso 4: Cerrar el Scanner.
        lector.close();

        
    }
}