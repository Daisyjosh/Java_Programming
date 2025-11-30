import java.util.*;
public class isprime 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= n-1; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;

            }
        }
        if(isPrime)
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
