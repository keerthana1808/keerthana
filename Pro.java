import java.util.Scanner;
class Pro
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
          System.out.println("negative");
        }
        else if(n>0)
        {
           System.out.println("positive");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
