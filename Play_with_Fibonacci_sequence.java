import java.util.*;
class fibonacci
{
    public static void main(String args[])
{
    int n, x=0,y=1,sum=0,count=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    System.out.print(+x+ " ");
    System.out.print(+y+" ");
    while(count<n-2)
{   
    sum=x+y;
    x=y;
    y=sum;
    count++;
System.out.print(+sum+ " ");
}
}
}