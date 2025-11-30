public class diamondpattern {
        public static void main(String[] args) {
            java.util.Scanner s = new java.util.Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = s.nextInt();
            for(int i = n; i >= 1; i--) // top half
            {
                //spaces
                for(int j = 1; j <= i-1; j++)
                {
                    System.out.print(" ");
                }
                //stars
                for(int k = 1; k <= (n-i)+1; k++)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
                //abcd
                for(int z = (n-i)+1; z <= (2*n-2*i)+1; z++)
                {
                    System.out.print((char)(64+z));
                }
                System.out.println();

            }
            for(int i = n; i >= 1; i--)//bottom half
            {
                for(int j = 1; j <= n-i; j++)//spaces
                {
                    System.out.print(" ");
                }

                for(int k = n; k >= (n-i)+1; k--)//numbers
                {
                    System.out.print(k);
                }
                System.out.print(" ");
                for(int z = (2*n-2*i)+1; z <= (2*n-2)+1; z = z+2)
                {
                    System.out.print(z);
                }
                System.out.println();

            }
            s.close();

        }
    }