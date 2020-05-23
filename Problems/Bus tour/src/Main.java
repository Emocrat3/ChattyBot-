import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alturaBus = in.nextInt(), cantidadPuentes = in.nextInt();
        for (int i = 1; i <= cantidadPuentes; i ++) {
            int alturaPuentes = in.nextInt();
            if (i == cantidadPuentes) {
                System.out.println("Will not crash");
            } else {
                if (alturaBus >= alturaPuentes) {
                    System.out.println("Will crash on bridge " + i);
                    break;
                }
            }
        }
    }
}

