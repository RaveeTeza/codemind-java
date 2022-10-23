import java.util.*;
class seriessum
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i;
        int j=sc.nextInt();
        float sum=0;
        for (i=1;i<=j;i++)
        {
            sum=sum+(1.0f/i);
        }
        System.out.format("%.2f",sum);
        sc.close();
    }
}