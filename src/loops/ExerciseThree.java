package loops;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int a = Integer.parseInt(in.nextLine());

        System.out.println("Podaj druga WIEKSZA liczbe: ");
        int b = Integer.parseInt(in.nextLine());

        if (a > b) {
            System.out.println("Nieprawidlowe liczby");
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}
