import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        /*int grade , count , sum = 0;
        for (count = 0 ; count <= 5 ; count++)
        {
            System.out.println("Enter student grades " + count);
            grade = read.nextInt();
            sum += grade;
        }
        System.out.println("Average of grades is "+ (sum / count));
       read.close();
    }*/

    /*System.out.println("Numbers from 0 to 10");
    for (int count = 0 ; count <= 10; count++)
    {
        System.out.println(count);
    }

    System.out.println("Numbers from 10 to 0");
    for (int count = 10 ; count >= 0; count--)
    {
        System.out.println(count);
    }

    System.out.println("Numbers from 2 to 20");
    for (int count = 2; count <= 20; count += 2)
    {
        System.out.println(count);
    }*/
    /*int num;
    int EvenSum = 0 , OddSum = 0;
    System.out.println("Enter 10 numbers:");
    for (int count = 1; count <= 10; count++)
    {
        num = read.nextInt();
        if (num % 2 == 0)
        {
            EvenSum += num ;
        }
        else 
        {
           OddSum += num;
        }
    }
    System.out.println("Even sum is " + EvenSum);
    System.out.println("Odd sum is "+ OddSum);
    */

    //Factorial for any given number
    /*int fact = 1;
    int num;
    System.out.println("Enter a number: ");
    num = read.nextInt();
    for(int i = num; i >= 1; i--)
    {
        fact = fact * i;
    }
    System.out.println( "The Factorial of number is " + fact);*/

    //Nested loop
    int value;

    for (int j = 1; j<= 5; j++)
    {
        System.out.println("Enter a number: ");
        value = read.nextInt();
    
     int fact = 1;
     for(int i = value; i >= 1; i--)
        {
            fact = fact * i;
            
        }
        System.out.println( "The Factorial of number is " + fact);

    }
    
    read .close();
}
}
