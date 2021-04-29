public class AreaCalculator {
    public static double area(double radius){
        double area = 0;
        if (radius<0){
            return -1;
        }else{
            area = Math.PI*radius*radius;
        }
        return area;
    }

    public static double area(double x, double y){
        double area = 0.0;
        if (x<0||y<0){
            return -1;
        }else{
            area = x*y;
        }
        return area;
    }

}
