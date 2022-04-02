package conditionals;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dochod: ");

        long dochod = Integer.parseInt(in.nextLine());
        double podatek;
        double podatekPonizejProgu;

        if (dochod <= 0) {
            System.out.println("Od ujemnych dochodow podatku nie odliczysz.");
        }
        else if (dochod <= 85528) {
            podatek = dochod * 0.17;
            System.out.println("Jestes w pierwszym progu podatkowym. Zaplacisz " + podatek + " zl podatku.");
        }
        else if (dochod > 85528) {
            podatekPonizejProgu = 85528 * 0.17;
            podatek = podatekPonizejProgu + ((dochod - 85528) * 0.32);
            System.out.println("Jestes w drugim progu podatkowym. Zaplacisz " + podatek + " zl podatku.");
        }
    }
}