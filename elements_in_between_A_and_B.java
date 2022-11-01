import java.util.*;
class elementsbetweennumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
          {
              array[i]=sc.nextInt();
          }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++)
        {
            if(array[i]>=a&&array[i]<=b)
              {
                  System.out.print(array[i]+" ");
               sum++;
}
}
if(sum==0)
System.out.print("-1");
}
}