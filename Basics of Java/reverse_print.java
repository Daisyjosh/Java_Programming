import java.util.*;
public class reverse_print {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int l_digit;
        int res= 0;
        while(n != 0)
        {
            l_digit = n % 10;
            res = res * 10 + l_digit;
            n /= 10;

        }
        System.out.print(res);
        sc.close();

    }
    
}
