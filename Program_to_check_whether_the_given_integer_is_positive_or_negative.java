import java.util.Scanner;
class integer
{
    public static void main (String args[])
{
    Scanner sc=new Scanner(System.in);
    int c=sc.nextInt();
    if(c>0)
    {
        System.out.println("Positive Number");
    }
    else
    {
        System.out.println("Negative Number");
    }
    sc.close();
}
}