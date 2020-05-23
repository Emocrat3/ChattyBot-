import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Long m = in.nextLong();
        Long n = 1L;

        while (n <= m) {
            m = m / n;
            n++;
        }
        System.out.println(n);
    }
}