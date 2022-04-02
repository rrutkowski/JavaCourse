package conditionals;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        double pierwszaLiczba = Integer.parseInt(in.nextLine());

        System.out.println("Podaj dzialanie: ");
        String dzialanie = in.nextLine();

        System.out.println("Podaj druga liczbe: ");
        double drugaLiczba = Integer.parseInt(in.nextLine());

        switch (dzialanie) {
            case "+":
                System.out.println(pierwszaLiczba + drugaLiczba);
                break;
            case "-":
                System.out.println(pierwszaLiczba - drugaLiczba);
                break;
            case "*":
                System.out.println(pierwszaLiczba * drugaLiczba);
                break;
            case "/":
                System.out.println(pierwszaLiczba / drugaLiczba);
                break;
        }
    }
}
