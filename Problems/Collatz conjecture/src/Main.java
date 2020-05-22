import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean flag = true;


        while (flag) {
            if (n == 1) {
                flag = false;
            }
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = n * 3 + 1;
            }
        }
    }
}