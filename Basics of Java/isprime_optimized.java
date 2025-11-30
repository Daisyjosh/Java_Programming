import java.util.*;
import java.lang.Math;
public class isprime_optimized {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                isprime = false;
                
            }
        }
        if(isprime)
        {
            System.out.print("It is a prime number");
        }
        else
        {
            System.out.print("It is not a prime number");
        }
        sc.close();
    }
    
}
