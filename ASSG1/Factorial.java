
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        int fact = 1;
        int i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
          for(i=1;i<=num;++i)
        {
            fact = fact * i;
        }
  
        System.out.println("\nFactorial of " + num + " is: " + fact);
    }
}
