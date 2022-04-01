package tables;

public class ExerciseTwo {
    public static void main(String[] args) {
        double[][] tablicaDoubli = new double[][]{{2.3, 3.1, 2, 2, 32.3, 2.4}, {2.3, 3.1, 2, 2, 32.3, 2.4},
                {2.3, 3.1, 2, 2, 32.3, 2.4}};

        double sumaWierszPierwszy = tablicaDoubli[0][0] + tablicaDoubli[0][1] + tablicaDoubli[0][2] +
                tablicaDoubli[0][3] + tablicaDoubli[0][4];
        double sumaWierszDrugi = tablicaDoubli[1][0] + tablicaDoubli[1][1] + tablicaDoubli[1][2] +
                tablicaDoubli[1][3] + tablicaDoubli[1][4];
        double sumaWierszTrzeci = tablicaDoubli[2][0] + tablicaDoubli[2][1] + tablicaDoubli[2][2] +
                tablicaDoubli[2][3] + tablicaDoubli[2][4];

        System.out.println("Wiersz pierwszy ma dlugosc: " + tablicaDoubli[0].length + ", a jego suma to: " + sumaWierszPierwszy);
        System.out.println("Wiersz drugi ma dlugosc: " + tablicaDoubli[1].length + ", a jego suma to: " + sumaWierszDrugi);
        System.out.println("Wiersz trzeci ma dlugosc: " + tablicaDoubli[2].length + ", a jego suma to: " + sumaWierszTrzeci);
    }
}