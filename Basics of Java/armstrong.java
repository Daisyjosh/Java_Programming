import java.util.*;
public class armstrong {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int N = n;
        System.out.print("\n");
        int sum = 0, last_digit;
        
        while(n>0)
        {
            last_digit = n % 10;
            sum = sum + last_digit*last_digit*last_digit;
            n /= 10;


        }
        if(sum == N)
        {
            System.out.println("The given number is an Armstrong number");
        }
        else
        {
            System.out.println("The given number is not an Armstrong number");
        }
        sc.close();


    }
    
}
