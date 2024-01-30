package DAY_1.HW;
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int original=n;
       int rev=0;
       while(n>0)
       {
          int ld=n%10;
          rev= (rev*10)+ld;
          n=n/10;
       }
       if(rev==original)
       {
           System.out.println("True");
       }
       else
       {
           System.out.println("False");
       }


    }
}
