import java.util.Scanner;

public class BuscarUnNumeroEnUnVector {

    
{}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicita al usuario ingresar 10 números
        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": "); 
            numeros[i] = scanner.nextInt();
        }

        // Solicita un número adicional
        System.out.print("Ingresa un número para buscar en el vector: ");
        int numeroBuscado = scanner.nextInt();

        // Verifica si el número está en el vector
        boolean encontrado = false;
        for (int num : numeros) {
            if (num == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        // Muestra el resultado
        if (encontrado) {
            System.out.println("¡El número fue encontrado en el vector!");
        } else {
            System.out.println("El número NO fue encontrado en el vector.");
        }

        scanner.close();
    }
}


