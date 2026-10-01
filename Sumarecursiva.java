public class Sumarecursiva {
    public static void main(String[] args) {
        int n = 5; // Número hasta el cual se desea sumar
        int resultado = sumaRecursiva(n);
        System.out.println("La suma de los números del 1 al " + n + " es: " + resultado);
    }

    public static int sumaRecursiva(int n) {
        if (n == 1) {
            return 1; // Caso base: la suma de los números hasta 1 es 1
        } else {
            return n + sumaRecursiva(n - 1); // Llamada recursiva
        }
    }
}