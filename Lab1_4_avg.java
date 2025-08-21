import java.util.Arrays;
import java.util.Scanner;

public class Lab1_4_avg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("num[%d]: ", i + 1);
            nums[i] = sc.nextInt();
        }
        int sum = 0, min = nums[0], max = nums[0];
        for (int n : nums) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = sum / (double) nums.length;
        System.out.printf("\nAverage = %.2f\nMinimum = %d\nMaximum = %d\n", avg, min, max);
    }
}