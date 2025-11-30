import java.util.*;
public class starpattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            char val = '*';
            for(int j = 1; j <= i; j++)
            {
                System.out.print(val + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
