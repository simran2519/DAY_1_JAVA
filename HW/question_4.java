
package DAY_1.HW;
//Print the following pattern for the given number of rows.
//Note: N is always odd.
//Pattern for N = 5
//     *
//   ***
// *****
//   ***
//     *

public class question_4
{
    public static void main(String[] args)
    {
        int n = 9, fh = (n/2)+1, sh = n-fh, s = 1;
        int i, j ,k;
        for(i=0; i<fh; i++)
        {
            for(j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for(k=0; k<s; k++)
            {
                System.out.print("*");
            }
            s+=2;
            System.out.println();
        }
        int s1 = n-2;
        int sp = (n/2)+2;
        for(i=0; i<sh; i++)
        {
            for(j=0; j<sp; j++)
            {
                System.out.print(" ");
            }
            sp++;
            for(k=1; k<=s1; k++)
            {
                System.out.print("*");
            }
            s1 -=2;
            System.out.println();
        }
    }
}
