import java.util.Scanner;
public class RevisionLoop 
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        int num , group;
        char option;
        double weight , Result = 0;

        System.out.println("Enter no.of groups: ");
        group = read.nextInt();
        
        for (int j = 1; j<= group ; j++)
        { 
        System.out.println("Enter numbers of passengers group " + j);
        num = read.nextInt();

        System.out.println("F. First class");
        System.out.println("B. Business class");
        System.out.println("E. Economy class");

        for (int i = 1; i <= num ; i++)
        {
         
         System.out.println("Plz Enter passenger's class " + i);
         option = read.next().charAt(0);

        switch (option) 
        {
            
            case 'F': 
            System.out.println("Plz Enter Passenger's lagguge weight: ");
            weight = read.nextDouble();

            if (weight > 30)
            {
                Result = (weight - 30) *10;
                System.out.println("You must pay " + Result);
            }
            else 
             System.out.println("Have a nice Flight");
            break;

            case 'B': 
            System.out.println("Plz Enter passenger's lagguge weight: ");
            weight = read.nextDouble();

            if (weight > 25)
            {
                Result = (weight - 25) *10;
                System.out.println("You must pay " + Result);
            }
            else 
            System.out.println("Have a nice Flight");
            break;
            
            case 'E': 
            System.out.println("Plz Enter passenger's lagguge weight: ");
            weight = read.nextDouble();

            if (weight > 20)
            {
                Result = (weight - 20) *10;
                System.out.println("You must pay " + Result);
            }
            else 
            System.out.println("Have a nice Flight");
            break;

            default:
            System.out.println("Invallied char");
                break;
        }
        } 
        }   
      read.close();
    }
    
}
