public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        boolean leap = false;
        if (year<=1 || year>=9999){
            return false;
        }
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        }
        else{
            leap = false;
        }
        return leap;

    }
}
