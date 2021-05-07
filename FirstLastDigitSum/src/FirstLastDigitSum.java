public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            int temp = number;
            while (true) {
                int lastDigit = temp % 10;
                int firstDigit = 0;
                if (temp % 10 == number) {
                    lastDigit = number;
                    firstDigit = number;
                    sum = lastDigit + firstDigit;
                    break;
                } else {
                    //  find last digit  -> number%10
                    // find first digit -> number/(10^(totaldigits - 1))
                    int count = 0;
                    while(true){
                        if (number<=0){
                            break;
                        }else{
                            count++;
                            number/=10;
                        }
                    }
                    int digits = count;
                    int divisor = (int)Math.pow(10,digits-1);
                    firstDigit = temp/divisor;
                    sum = lastDigit+firstDigit;
                    break;
                }

            }
            return sum;
        }
    }

}
