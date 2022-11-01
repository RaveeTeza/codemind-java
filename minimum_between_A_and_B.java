import java.util.*;
class minimumbetweennumbers
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
        int min=10;
        for (int i=0;i<n;i++)
        {
            if (array[i]>=a&&array[i]<=b)
            {
              if(min>(array[i]))
              {
                  min=array[i];
              }
    }
}
if(10>min)
System.out.print(min);
else 
System.out.print("-1");
}
}