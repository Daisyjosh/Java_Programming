import java.util.*;
public class reverse_num {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last_digit;
        while(n!=0)
        {
            last_digit = n % 10;
            System.out.print(last_digit);
            n /= 10;
    
        }
        sc.close();

    }
    
}
