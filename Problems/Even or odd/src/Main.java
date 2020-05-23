import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            int numero = in.nextInt();
            if (numero == 0){
                flag= false;
            }
           if(numero % 2 == 0 && numero > 1){
                System.out.println("even");
            }else if (numero % 2 != 0){
                System.out.println("odd");
            }
           }
        }
    }
