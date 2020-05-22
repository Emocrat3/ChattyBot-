import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max= 0, num, div = 4, elementos;
        elementos = in.nextInt();

        for (int i= 1; i < elementos; i++) {
            num = in.nextInt();
            if (num%div == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}