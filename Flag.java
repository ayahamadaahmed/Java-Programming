import java.util.Scanner;
public class Flag {
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in) ;

       /*float Sum = 0 ;
       int num ; 
       boolean nonnegative = true;

       while (nonnegative) {

        System.out.println("Enter positive numbers: ");
        num = read.nextInt();

        if (num < 0)
        {
            nonnegative = false;
        }
        else 
        {
            Sum += num;
        }
       }

       System.out.println("Sum of positive numbers = " + Sum);*/

       int guess , rand;

       rand = (int) (Math.random()*100);
       boolean play = true;

       System.out.println("Random number is " + rand);

       while (play) {
        
        System.out.println("Guess the number: ");
        guess = read.nextInt();

    
        if (guess < rand)
        {
            System.out.println("Guess is small");
        }
        else if (guess > rand)
        {
            System.out.println("Guess is large");
        }
        else 
        {
            System.out.println("You Win!");
            play = false;
        }


       }

    read.close();
    }
    
}
