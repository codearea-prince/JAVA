import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%2==1)
        {
            System.out.println("odd number");
        }
        else
        {
            System.out.println("even number");
        }
    }
    
}
