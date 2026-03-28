package util;

import java.util.Scanner;

public class Validaciones {

    static Scanner sc = new Scanner(System.in);

    public static String texto(String msg) {
        String dato;
        do {
            System.out.print(msg);
            dato = sc.nextLine();
        } while (dato.isEmpty());
        return dato;
    }

    public static int numero(String msg) {
        int num;
        while (true) {
            try {
                System.out.print(msg);
                num = Integer.parseInt(sc.nextLine());
                return num;
            } catch (Exception e) {
                System.out.println("Número inválido");
            }
        }
    }
}
