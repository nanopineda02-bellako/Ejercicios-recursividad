public class fakestring {
    public static void main(String[] args) {
        String texto = "Hola Mundo"; // Cadena que se desea invertir
        String textoInvertido = invertirStringRecursivo(texto);
        System.out.println("El texto invertido es: " + textoInvertido);
    }public static String invertirStringRecursivo(String texto) {
    // Caso base: si la cadena está vacía o tiene 1 carácter, ya está "invertida"
    if (texto == null || texto.isEmpty()) {
        return texto;
    }
    // Paso recursivo: invierte el resto de la cadena y concatena el primer carácter al final
    return invertirStringRecursivo(texto.substring(1)) + texto.charAt(0);
}
}
