import java.util.*;
class pattern1234
{
   public static void main(String args[])     // To do auto generated method stub
{
  Scanner sc=new Scanner (System.in);
int r;
r=sc.nextInt();
for(int i=1;i<=r; i++)
{
   for (int j=1;j<=r;j++)
{
    if (j<=i)
System.out.print(j);
}
  System.out.println();
}
}
}