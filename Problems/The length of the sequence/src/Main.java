import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        int cantidad = 0;
        while (flag) {
           int numero = in.nextInt();
            if (numero > 0 && numero != 0){
                cantidad++;
            }else if (numero == 0){
                flag = false;
            }
        }
        System.out.println(cantidad);
    }
}