package DAY_1.HW;
import java.util.Scanner;
public class PrimeNumbers
{
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("The prime numbers from 2 to " + n + "are: ");

        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }

    }
}
