import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        boolean result = false;
        BigDecimal a1 = new BigDecimal(a*1000).setScale(0,BigDecimal.ROUND_DOWN);
        System.out.println(a1);
        BigDecimal b1 = new BigDecimal(b*1000).setScale(0,BigDecimal.ROUND_DOWN);
        System.out.println(b1);
        result = (a1.compareTo(b1)==0);

        return result;
    }
}
