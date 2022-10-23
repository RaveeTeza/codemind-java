import java.util.*;
class pattern01
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j||j==n-i-1)
                  System.out.print("x");
                  else 
                   System.out.print("0");
            }
              System.out.println();
        }
        
    }
}