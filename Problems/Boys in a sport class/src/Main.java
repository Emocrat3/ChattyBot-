import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int h2 = in.nextInt();
        int h3 = in.nextInt();

        boolean descOrdered = h1 >= h2 && h2 >= h3 || h1 <= h2 && h2 <= h3;
        System.out.println(descOrdered);

    }
}