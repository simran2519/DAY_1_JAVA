package DAY_1.HW;

import java.util.Scanner;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)             //for UPPER TRiangle
        {
            for(int k=i;k<n-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //For Lower Triangle
        for(int i=1;i<n;i++)           //start from i=0 for one for row
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*n)-(2*i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
