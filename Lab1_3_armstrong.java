import java.util.Scanner;
public class Lab1_3_armstrong {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int result = 0;
        int n = 0;

        int temp = num;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        temp = num;
        do {
            int digit = temp % 10;
            result += Math.pow(digit, n);
            temp /= 10;
        } while (temp != 0);

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}