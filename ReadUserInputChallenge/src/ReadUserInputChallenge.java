import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine(); // handle end of line enter key

        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}



