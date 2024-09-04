import java.util.Scanner;
public class BreakandContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num , sum = 0 , count = 1;
        //Continue
        while(count <= 5)
        {
            System.out.println("Enter positive numbers: ");
            num = input.nextInt();
            if (num < 0)
            {
                System.out.println("Enter only Positive number");
                continue;
            }
            sum += num;
            count ++;
        }
        System.out.println("Sum = " + sum);
        
        //Break
        while(count <= 5)
        {
            System.out.println("Enter positive numbers: ");
            num = input.nextInt();
            if (num < 0)
            {
                System.out.println("Enter only Positive number");
                break;
            }
            sum += num;
            count ++;
        }
        System.out.println("Sum = " + sum);
        
        input.close();
    }
}
