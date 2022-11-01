import java.util.*;
class maximumbetweennumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
          array[i]=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        int max=0;
        for (int i=0;i<n;i++)
        {
            if (array[i]>=a&&array[i]<=b)
            {
              if(max<(array[i]))
              {
                  max=array[i];
              }
    }
}
if(max>0)
System.out.print(max);
else 
System.out.print("-1");
}
}