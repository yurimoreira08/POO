public class Exercicios {

    public static void main(String[] args) {
        // 1. Imprima todos os números de 150 a 300.
        for (int i = 150; i <= 300; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // 2. Imprima a soma de 1 até 1000.
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 1000: " + soma);

        System.out.println("\n");

        // 3. Imprima todos os múltiplos de 3, entre 1 e 100.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        // 4. Imprima os fatoriais de 1 a 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fatorial de " + i + ": " + fatorial(i));
        }

        System.out.println("\n");

        // 5. Imprima os fatoriais de 1 a 20, 30 e 40 usando long para ver a mudança.
        for (int i = 1; i <= 20; i++) {
            System.out.println("Fatorial de " + i + ": " + fatorialLong(i));
        }

        // 6. Imprima os primeiros números da série de Fibonacci até passar de 100.
        int a = 0, b = 1;
        System.out.print("\nSérie de Fibonacci até passar de 100: " + a + " " + b + " ");
        int fibonacci;
        while ((fibonacci = a + b) <= 100) {
            System.out.print(fibonacci + " ");
            a = b;
            b = fibonacci;
        }
    }

    // Método para calcular o fatorial usando int
    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular o fatorial
    public static long fatorialLong(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
