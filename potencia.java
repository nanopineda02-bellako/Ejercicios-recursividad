public class potencia {
    public static void main(String[] args) {
        int base = 2; // Base de la potencia
        int exponente = 3; // Exponente al que se desea elevar la base
        int resultado = potenciaRecursiva(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }
    public static int potenciaRecursiva(int base, int exponente) {
        // Caso base: cualquier número elevado a la potencia 0 es 1
        if (exponente == 0) {
            return 1;
        }
        // Paso recursivo: base * base^(exponente-1)
        return base * potenciaRecursiva(base, exponente - 1);
    }
}
