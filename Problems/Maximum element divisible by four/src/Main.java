import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        long resultado = a +1;

        for (long i = a; i < b; i++) {
            resultado *= i ;
        }

    }
}