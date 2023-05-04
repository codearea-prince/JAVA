import java.util.Scanner;
public class numSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int sum=0,r;
         while(n>0)
        {
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        System.out.println("the sum of number is :" + sum);
    }
}