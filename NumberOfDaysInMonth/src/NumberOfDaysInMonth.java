public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if (year <= 1 || year >= 9999) {
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
        } else {
            leap = false;
        }
        return leap;

    }
    public static int getDaysInMonth(int month, int year){
        if ((month<1 || month>12) || (year<1 || year>9999)){
            return -1;
        }else{
            switch (month){
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                    }else{
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;
            }
        }
    }
}
