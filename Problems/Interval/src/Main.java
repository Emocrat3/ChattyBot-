import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();

        if (numero > -15  && numero <= 12 || numero > 14 && numero < 17 || numero >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}