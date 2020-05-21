import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}