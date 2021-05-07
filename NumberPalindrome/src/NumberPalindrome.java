import static java.lang.StrictMath.abs;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        boolean check = false;
        int reverse = 0;
        int copy = abs(number);
        while (true) {
            int lastDigit = copy % 10;
            reverse *= 10;
            reverse += lastDigit;
            copy = copy / 10;
            if (copy <= 0) break;
        }

        if (Math.abs(number) == reverse) {
            check = true;
        }

        return check;
    }
}
