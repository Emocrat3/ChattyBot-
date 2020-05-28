import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a;

        for (int i = 1; i <= a; i++){
            for (int j = i; j > 0; j--){
                System.out.print(i + " ");
                b--;
                if (b == 0){
                    break;
                }
            }
            if (b == 0){
                break;
            }
        }
    }
}