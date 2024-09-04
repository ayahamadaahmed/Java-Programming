import java.util.Scanner;
public class IFState {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

       /*  int Grade;
        System.out.println("PLZ Enter your grade:");
        Grade = input.nextInt();

        if (Grade >= 60)
        {
            System.out. println("You Passed");
            System.out.println("Go to the next level");
        }*/
        /*int num1;
        int num2;
        System.out.println("PLZ Enter two integer numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num %2 == 0 )
        {
            System.out.println("This number is even");
        }
        else
        {
            System.out.println("This number is odd");
        }*/

        /*if (num >= 0 )
        {
            System.out.println("Number is Positive");
        }
        else 
        {
            System.out.println("Number is Negative");
        }*/
        /*if (num >= 0)
        {
            if (num % 2 == 0)
           {
              System.out.println("This number is Even");
           }
           else 
            {
               System.out.println("This number is Odd");
            }   
        }
        else{
            System.out.println("Number is Negative");
        }*/

        /*if (num1 == num2)
        {
            System.out.println("Two numbers are Equal");
        }

        else if (num1 > num2)
        {
            System.out.println("Num1 is greater than Num2");

        }
        else 
        {
            System.out.println("Num2 is greater than Num1");
        }*/


        //grades
        int grade;
        System.out.println("PLZ Enter your grade");
        grade = input.nextInt();
       /*  if (grade >= 90 && grade <= 100)
        {
            System.out.println("A");
        }
        else if (grade >= 80 )
        {
            System.out.println("B");
        }
        
        else if (grade >= 70)
        {
            System.out.println("C");
        }

    
        else if (grade >= 60)
        {
            System.out.println("D");
        }

        else 
        {
            System.out.println("F");
        }

    }*/

   /*  if (grade >= 0 && grade <= 100)
    {
        System.out.println("The number between 0 and 100 ");
    }*/

    if (grade >= 0 || grade <= 100)
    {
        System.out.println("The number between 0 and 100 ");
    }
    
    input.close();  
}
}
