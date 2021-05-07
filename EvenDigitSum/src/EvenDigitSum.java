public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int temp = number;
        int sum = 0;
        int count = 0;
        if (number < 0) sum = -1;
        while (true) {
            if (number <= 0) {
                break;
            } else {
                count++;
                number /= 10;
            }
        }
        while (count != 0) {
            int digit = temp % 10;
            temp = temp / 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            count--;
        }
        return sum;
    }
}
