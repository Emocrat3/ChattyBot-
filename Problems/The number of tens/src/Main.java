import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = (numero / 10) % 10;
        System.out.println(resultado);
    }
}