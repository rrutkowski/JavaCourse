package loops;

public class ExerciseFour {

    public static void main(String[] args) {
        int sum = 0;

        int[] tab = new int[]{2, 3, 4, 6, 33, 67, 23, 6, 6, 0};

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
            sum += tab[i];
        }
        System.out.println();
        System.out.println("Suma = " + sum);
        System.out.println();
        for (int i = tab.length-1; i >= 0; i--) {
            System.out.println(tab[i] + " ");
        }


    }
}
