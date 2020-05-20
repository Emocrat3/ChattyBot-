import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String burg = in.nextLine();

        boolean endsWith = burg.endsWith("burg");
        System.out.println(endsWith);
    }
}