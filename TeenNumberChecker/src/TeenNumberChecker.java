public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        boolean teen = false;
        if (isTeen(a)|| isTeen(b)|| isTeen(c)){
            teen = true;
        }
        return teen;
    }

    public static boolean isTeen(int a) {
        boolean check = false;

        if (a < 13 || a > 19) {
            check = false;
        } else {
            check = true;
        }
        return check;
    }

}
