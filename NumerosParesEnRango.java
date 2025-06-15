import java.util.Scanner; 

public class NumerosParesEnRango {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner lector = new Scanner(System.in);

        int inicio; // Para el número inicial del rango
        int fin;    // Para el número final del rango

        System.out.println(" Buscador de Números Pares en un Rango ");
        System.out.println("Te mostraré todos los números pares entre dos valores que me des.");
        

        // Paso 1: Solicitar y validar el número inicial "inicio"
        while (true) {
            System.out.print("1. Ingresa el número INICIAL del rango (entero positivo): ");
            if (lector.hasNextInt()) {
                inicio = lector.nextInt();
                if (inicio >= 0) { // Debe ser positivo o cero
                    break; // Salimos del bucle si es un número válido
                } else {
                    System.out.println("Hay un Error. El número inicial debe ser un entero positivo o cero.");
                }
            } else {
                System.out.println("Entrada incorrecta. Por favor, ingresa solo NÚMEROS enteros.");
                lector.next(); // Descarta la entrada incorrecta
            }
        }

        // Paso 2: Solicitar y validar el número final "fin"
        while (true) {
            System.out.print("2. Ingresa el número FINAL del rango (entero positivo): ");
            if (lector.hasNextInt()) {
                fin = lector.nextInt();
                if (fin >= inicio) { // El fin debe ser mayor o igual que el inicio
                    break; // Salimos del bucle si es un número válido
                } else {
                    System.out.println("Hay un Error. El número final debe ser mayor o igual que el número inicial (" + inicio + ").");
                }
            } else {
                System.out.println("Entrada incorrecta. Por favor, ingresa solo NÚMEROS enteros.");
                lector.next(); // Descarta la entrada incorrecta
            }
        }

        // Cerramos el Scanner.
        lector.close();

        System.out.println("\n--- Números Pares entre " + inicio + " y " + fin + " ---");
        boolean seEncontraronPares = false; // Bandera para saber si encontramos al menos un par

        // Paso 3: Utilizar la sentencia "for" para iterar desde "inicio" hasta "fin"
        for (int i = inicio; i <= fin; i++) {
            // Paso 4: En cada iteración, verificar si el número actual es par
            if (i % 2 == 0) { // Un número es par si su residuo al dividir por 2 es 0
                // Paso 5: Si el número es par, imprimirlo en pantalla
                System.out.println(i);
                seEncontraronPares = true; // Marcamos que sí encontramos pares.
            }
        }

        // Paso 6: Al finalizar el bucle, mostrar un mensaje final
        if (seEncontraronPares) {
            
            System.out.println("Se han impreso todos los números pares en el rango especificado");
        } else {
            System.out.println("No se encontraron números pares en el rango de " + inicio + " a " + fin + ".");
            
        }
    }
}