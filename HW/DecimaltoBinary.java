package DAY_1.HW;
import java.util.Scanner;
public class DecimaltoBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int binary[]= new int[32];
        int i=0;
        while(n>0)
        {
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binary[j]);
        }
    }
}
