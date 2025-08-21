import java.util.Scanner;
public class Lab1_3_multiplication {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for multiplication Table ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
                    System.out.println(num*i);
        }
    } 
}
