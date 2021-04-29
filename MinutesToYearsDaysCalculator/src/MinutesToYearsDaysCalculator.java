public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){

        if (minutes<0){
            System.out.println("Invalid Value");
        }else{
            long XX = minutes;
            long YY = minutes/(365*24*60);
            long ZZ = (minutes/(24*60))%365;
            System.out.println(XX + " min = " + YY +" y and "+ ZZ +" d");
        }

    }
}
