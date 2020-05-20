import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String palabra1 = in.nextLine().replace(" ", "");
        String palabra2 = in.nextLine().replace(" ", "");

        System.out.println(palabra1.equals(palabra2));

    }
}