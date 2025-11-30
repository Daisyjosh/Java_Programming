import java.util.*;
public class ifelse {

    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String type = (n%2 == 0) ? "even": "odd";
        System.out.println(type);
        if(n>90)
        {
            System.out.println("Good");
        }
        else if(n < 90)
        {
            System.out.println("Okay");
        }
        else
        {
            System.out.println("Seri...!");
        }
        sc.close();



    }
    
}
