package loops;

public class ExerciseFive {
    public static void main(String[] args) {
        int n = 4;
        int silnia = 1;
        for (int i = n; i > 0; i--) {
            silnia *= i;
        }
        System.out.println(n+"! = " + silnia);
    }
}
/*4! = 1*2*3*4
silnia = 1*4
silnia = 4*3
silnia = 12*2
silnia = 24*1

 */