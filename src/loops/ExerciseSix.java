package loops;

public class ExerciseSix {
    public static void main(String[] args) {
        int n = 5;
        int liczbaGwiazdek = 1;

        for (int i = 1; i<=n; i++) {
            for(int j = 1; j<=liczbaGwiazdek; j++){
                System.out.print("*");
            }
            System.out.println();
            liczbaGwiazdek++;
        }

        for (int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}