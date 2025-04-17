import java.util.Scanner;

public class RegistroDeTemperaturas {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    double[] temperaturas = new double[30];

    double suma = 0;
    double mayor = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;

    // Ingreso de las 30 temperaturas
    for (int i = 0; i < 30; i++) {
        System.out.print("Ingresa la temperatura del día " + (i + 1) + ": ");
        temperaturas[i] = scanner.nextDouble();

        // Acumulamos para el promedio
        suma += temperaturas[i];

        // Verificamos si es la mayor
        if (temperaturas[i] > mayor) {
            mayor = temperaturas[i];
        }

        // Verificamos si es la menor
        if (temperaturas[i] < menor) {
            menor = temperaturas[i];
        }
    }

    // Calcular promedio
    double promedio = suma / 30;

    // Mostrar resultados
    System.out.println("\n--- Resultados ---");
    System.out.println("Temperatura mayor: " + mayor + "°C");
    System.out.println("Temperatura menor: " + menor + "°C");
    System.out.println("Temperatura promedio: " + promedio + "°C");

    // Verificar cuándo superó los 25 grados
    System.out.println("\nDías en que la temperatura superó los 25°C:");
    boolean huboCalor = false;
    for (int i = 0; i < 30; i++) {
        if (temperaturas[i] > 25) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + "°C");
            huboCalor = true;
        }
    }

    if (!huboCalor) {
        System.out.println("Ningún día superó los 25°C.");
    }

    scanner.close();
}
}
 
  
  

    

  




  
  


 
   








