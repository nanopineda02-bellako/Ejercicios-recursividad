public class fibonacci {
    public static void main(String[] args) {
        int n = 5; // Número de términos de la serie de Fibonacci que se desea calcular
        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }
    public static int fibonacciRecursivo(int n) {
    // Caso base: los primeros dos números (0 y 1) se devuelven tal cual
    if (n <= 1) {
        return n;
    }
    // Paso recursivo: la suma de (n-1) y (n-2)
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}
}
