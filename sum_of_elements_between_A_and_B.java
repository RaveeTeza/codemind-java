import java.util.*;
class sumofelementsbetweennumbers
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
        int max=0;
        for (int i=0;i<n;i++)
        {
            if (array[i]>=a&&array[i]<=b)
                  sum=sum+array[i];
              
    }
System.out.print(sum);

}
}