public class validadorcontraseñas {

    
{

    
} // Constante para la longitud mínima
private static final int LONGITUD_MINIMA = 8;


public static boolean esLongitudValida(String password) {
    return password.length() >= LONGITUD_MINIMA;
}


public static boolean contieneMayuscula(String password) {
    for (char c : password.toCharArray()) {
        if (Character.isUpperCase(c)) {
            return true;
        }
    }
    return false;
}


public static boolean contieneMinuscula(String password) {
    for (char c : password.toCharArray()) {
        if (Character.isLowerCase(c)) {
            return true;
        }
    }
    return false;
}


public static boolean contieneDigito(String password) {
    for (char c : password.toCharArray()) {
        if (Character.isDigit(c)) {
            return true;
        }
    }
    return false;
}

public static boolean esContrasenaSegura(String password) {
    return esLongitudValida(password) &&
           contieneMayuscula(password) &&
           contieneMinuscula(password) &&
           contieneDigito(password);
}

public static void main(String[] args) {
    String prueba1 = "clave123";         // ❌ sin mayúsculas
    String prueba2 = "ClaveSegura1";     // ✅ válida
    String prueba3 = "OTRAMAYUSCULA2";   // ❌ sin minúsculas
    String prueba4 = "corta1";           // ❌ muy corta
    String prueba5 = "Contraseña123";    // ✅ válida

    System.out.println("'" + prueba1 + "' es segura? " + esContrasenaSegura(prueba1));
    System.out.println("'" + prueba2 + "' es segura? " + esContrasenaSegura(prueba2));
    System.out.println("'" + prueba3 + "' es segura? " + esContrasenaSegura(prueba3));
    System.out.println("'" + prueba4 + "' es segura? " + esContrasenaSegura(prueba4));
    System.out.println("'" + prueba5 + "' es segura? " + esContrasenaSegura(prueba5));
}}
