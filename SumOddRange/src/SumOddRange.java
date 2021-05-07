public class SumOddRange {

    public static boolean isOdd(int number) {
        boolean check = false;
        if (number > 0) {

            if (number % 2 == 0) {
                check = false;
            } else {
                check = true;
            }
        } else {
            check = false;
        }

        return check;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start < 0 || end < 0) || (end < start)) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

}
