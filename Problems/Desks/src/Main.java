import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grupo1 = in.nextInt();
        int grupo2 = in.nextInt();
        int grupo3 = in.nextInt();
        int resto = grupo1 % 2 + grupo2 % 2 + grupo3 % 2;
        System.out.println(grupo1 / 2 + grupo2 / 2 + grupo3 / 2 + resto);

    }
}