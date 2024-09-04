import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*char grade ;
        
        System.out.println("Enter your grade: "); 
        grade = input.next().charAt(0);

        switch (grade) {
            case 'A':
            System.out.println("Excellent");
                
                break;

            case 'B':
            System.out.println("very good");
                break;

            case 'C': 
            System.out.println("good");   
                break;

            case 'D':
            System.out.println("Acceptpale");   
                break;

            case 'F':
            System.out.println("Failled");    

            default:
            System.out.println("Invailled");
                break;
        }*/

      /*int choise;
      int num1, num2;
      System.out.println("1.Add two numbers");
      System.out.println("2.Substruct two numbers");
      System.out.println("3.Get square of number");

      choise = input.nextInt();

        switch (choise) {

            case 1: System.err.println("Enter two numbers");
            num1 = input.nextInt();
            num2 = input.nextInt();
            System.out.println(num1 + num2); 
                 break;

            case 2:System.err.println("Enter two numbers");
            num1 = input.nextInt();
            num2 = input.nextInt();
            System.out.println(num1 - num2);

            case 3: System.out.println("Enter a Positive  number");
            num1 = input.nextInt();
            if (num1 > 0)
            System.out.println(num1 * num1);

            default:
            System.out.println("invailled");
                break;
        }*/

        char letter;
        System.out.println("Enter a letter");
        letter = input.next().charAt(0);

        switch (letter) {
            case 'A':
            case 'O':
            case 'H':
            case 'U':
            case 'e':
            case 'I': System.out.println("vowel");   
                break;
        
            default:System.out.println("It is't a vowel");
                break;
        }

        input.close();


    }
    
}
