
 import java.util.Scanner;

public class ValidadorCedula {

    // Método estático que valida el formato de la cédula
    public static boolean esFormatoCedulaValido(String numeroCedula) {
        // Verificamos la longitud de la cédula
        if (numeroCedula.length() != 10) {
            return false;
        }

        // Verificamos que cada carácter sea un dígito
        for (int i = 0; i < numeroCedula.length(); i++) {
            if (!Character.isDigit(numeroCedula.charAt(i))) {
                return false;
            }
        }

        // Verificamos que el primer carácter no sea '0'
        if (numeroCedula.charAt(0) == '0') {
            return false;
        }

        // Si pasa todas las verificaciones, la cédula es válida
        return true;
    }

    // Método main que ejecuta el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida
       System.out.println("Formato de Cédulas");

        // 
        String continuar = "S";
        while (continuar.equalsIgnoreCase("S")) {
            // Solicitar al usuario que ingrese una cédula
            System.out.print("Ingrese el número de cédula: ");
            String numeroCedula = scanner.nextLine();

            // Mostrar si es valido o invalido
            if (esFormatoCedulaValido(numeroCedula)) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.println("Formato de Cédula INVÁLIDO.");
            }

            // Preguntar al usuario si desea validar otra cédula
            System.out.print("¿Desea validar otra cédula? (S/N): ");
            continuar = scanner.nextLine();
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar el Sistema Validador.");
        scanner.close();
    }
}