import java.util.Scanner;

public class Ejercicio2 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Paso 1: Declarar e inicializar variables
        int numEstudiantes = 0;
        double[][] calificaciones;
        double[] promedios;
        int aprobados = 0;
        int reprobados = 0;
 
        // Solicitar el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        numEstudiantes = scanner.nextInt();
 
        // Inicializar arreglos con base al número de estudiantes
        calificaciones = new double[numEstudiantes][3];
        promedios = new double[numEstudiantes];
 
        // Paso 2: Solicitar las calificaciones
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese las calificaciones de (0.0 a 10.0) del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Calificación del examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
 
        // Paso 3: Calcular promedios y contar aprobados/reprobados
        for (int i = 0; i < numEstudiantes; i++) {
            double suma = 0;
 
            for (int j = 0; j < 3; j++) {
                suma += calificaciones[i][j];
            }
 
            promedios[i] = suma / 3;
 
            if (promedios[i] >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
 
            // Mostrar promedio individual
            System.out.println("Estudiante " + (i + 1) + " - Promedio: " + promedios[i]);
        }
 
        // Paso 4: Mostrar resultados finales
        System.out.println("\nCantidad de estudiantes aprobados: " + aprobados);
        System.out.println("Cantidad de estudiantes reprobados: " + reprobados);
 
        scanner.close();
    }
}

