package tables;

public class ExerciseOne {
    public static void main(String[] args) {
        int[] tablicaJedenWymiar = new int[5];
        tablicaJedenWymiar[0] = 1;
        tablicaJedenWymiar[1] = 4;
        tablicaJedenWymiar[2] = 5;
        tablicaJedenWymiar[3] = 6;
        tablicaJedenWymiar[4] = 7;

        int[] tablicaJedennWymiar = {1, 4, 5, 6, 7};

        int[] tablicaJedenWymiarr = new int[]{1, 4, 5, 6, 7};
        int suma = tablicaJedenWymiarr[0] + tablicaJedenWymiarr[1] + tablicaJedenWymiarr[2] + tablicaJedenWymiarr[3] +
                tablicaJedenWymiarr[4];
        System.out.println("Suma elementow tablicy = " + suma);
    }
}