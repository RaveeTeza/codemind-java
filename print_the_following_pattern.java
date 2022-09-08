import java.util.*;
class pattern4
{
   public static void main(String args[])     // To do auto generated method stub
{
  Scanner sc=new Scanner (System.in);
int c,r;
r=sc.nextInt();
for(int i=1;i<=r; i++)
{
   for (int j=1;j<=r;j++)
{
System.out.print((char)(64+i)+" ");
}
  System.out.println();
}
}
}