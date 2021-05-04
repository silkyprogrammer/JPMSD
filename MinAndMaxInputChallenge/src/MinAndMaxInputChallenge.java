import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true){

            System.out.println("Enter Number");
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt){
                int number = sc.nextInt();
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }
                if (number>max){
                    max = number;
                }
                if (number<min){
                    min = number;
                }
            }else{
                System.out.println("Invalid Number");
                break;
            }
            sc.nextLine(); // handle end of line enter key
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        sc.close();
    }
}
