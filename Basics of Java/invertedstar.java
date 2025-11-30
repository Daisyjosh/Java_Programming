import java.util.*;
public class invertedstar {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = n; i > 0; i--)
        {
            for(int j = i; j > 0; j--)
            {
                System.out.print("* ");

            }
            System.out.print("\n");

        }
        // another method
        System.out.print("Enter another number: ");
        int n2 = sc.nextInt();
        for(int i = 1; i <= n2;i++)
        {
            for(int j = 1; j <= (n-i+1);j++)
            // when n = 4 and i = 4 then (n - i + 1) is 4 and run continues...
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
