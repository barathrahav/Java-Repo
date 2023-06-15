import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i, n, f=1;
        System.out.println("Enter the value : ");
        n=in.nextInt();
        for(i=1; i<=n; i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of the number is "+f);
    }
}