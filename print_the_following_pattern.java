import java.util.*;
class pattern2
{
   public static void main(String args[])     // To do auto generated method stub
{
  Scanner sc=new Scanner (System.in);
int r,c;
r=sc.nextInt();
for(int i=1;i<=r; i++)
{
   for (int j=r;j>=1;j--)
{
System.out.print(j+" " );
}
  System.out.println();
}
}
}