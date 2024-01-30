package DAY_1.HW;

public class question_3
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=i;k<n-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
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
