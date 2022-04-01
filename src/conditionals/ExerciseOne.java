package conditionals;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe...");
        int liczba = Integer.parseInt(in.nextLine());

        if (liczba % 2 == 0) {
            System.out.println(liczba + " jest liczba parzysta");
        } else {
            System.out.println(liczba + " nie jest liczba parzysta");
        }
    }
}