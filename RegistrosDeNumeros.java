import java.util.Scanner;

public class RegistrosDeNumeros {
     
     

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

     System.out.println("ingrese el numero de estudiante");
     int numEstudiantes = scanner.nextInt();
    
     int[] calificaciones = new int[numEstudiantes];
    int reprobados = 0;
     int i = 0;
     while (i < numEstudiantes) {
        System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " (0-100, -1 para salir): ");
        int calificacion = scanner.nextInt();
        
        if (calificacion == -1) {
            System.out.println("Ingreso finalizado.");
            break;
        }
        
        if (calificacion >= 0 && calificacion <= 100) {
            calificaciones[i] = calificacion;
            if (calificacion < 60) {
                reprobados++;
            }
            i++;
        } else {
            System.out.println("Error: La calificación debe estar entre 0 y 100 o -1 para salir.");
        }
    }
    
    System.out.println("\nCalificaciones ingresadas:");
    int j = 0;
    while (j < i) {
        System.out.println("Estudiante " + (j + 1) + ": " + calificaciones[j]);
        j++;
    }
    
    System.out.println("Número de estudiantes reprobados: " + reprobados);
    
    scanner.close();
}
}
 
    
    
    


    




        

        
 
