import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        long result = 1;
        for (long i = a; i < b; i++) {
            result *= i  ;
        }
        System.out.println(result);
    }
}