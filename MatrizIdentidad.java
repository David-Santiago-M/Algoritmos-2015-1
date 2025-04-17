import java.util.Scanner;

public class MatrizIdentidad {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero para el tamaño de la matriz identidad: ");

        try {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Por favor ingresa un número entero positivo.");
            } else {
                int[][] matriz = new int[n][n];

                // Generar la matriz identidad
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j) {
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = 0;
                        }
                    }
                }

                // Imprimir la matriz identidad
                System.out.println("Matriz identidad de tamaño " + n + ":");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Debes ingresar un número entero.");
        }

        scanner.close();
    }
}


    

