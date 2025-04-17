import java.util.Scanner;

public class verificarError {
   
    public static void main(String[] args) {
        
          // Declarar vector para 5 puntuaciones
          int[] puntuaciones = new int[5];

          Scanner scanner = new Scanner(System.in);
  
          int puntuacionMaxima = 0;
          System.out.println("Ingrese las 5 puntuaciones:");
  
          // Ciclo para ingresar puntuaciones
          for (int i = 0; i < puntuaciones.length; i++) {
              System.out.print("Puntuación del jugador " + (i + 1) + ": ");
              puntuaciones[i] = scanner.nextInt();
  
              // Comprobar si es la puntuación máxima
              if (puntuaciones[i] > puntuacionMaxima) {
                  puntuacionMaxima = puntuaciones[i];
              }
          }
  
          // Mostrar puntuaciones
          System.out.println("\nPuntuaciones ingresadas:");
          int k = 0;
          while (k < puntuaciones.length) {
              System.out.println(puntuaciones[k]);
              k++;
          }
  
          // Mostrar puntuación máxima
          System.out.println("\nLa puntuación máxima fue: " + puntuacionMaxima);
  
          scanner.close();
      }
  }



