import java.util.Scanner;

public class ConteoDeNumerospareEimpares {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        // Pedir los 10 números al usuario
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Determinar si son pares o impares
        System.out.println("Resultados:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " es par");
            } else {
                System.out.println(numeros[i] + " es impar");
            }
        }
        
        scanner.close();
    }
}





