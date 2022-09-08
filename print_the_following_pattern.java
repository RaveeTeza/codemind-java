import java.util.*;
class pattern6
{
   public static void main(String args[])     // To do auto generated method stub
{
  Scanner sc=new Scanner (System.in);
int r;
r=sc.nextInt();
for(int i=r;i>=1; i--)
{
   for (int j=1;j<=i;j++)
{
System.out.print(j);
}
  System.out.println();
}
}
}