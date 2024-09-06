import java.util.Scanner;
public class Method_introduc {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      System.out.println( Math.sqrt(25)); 
      double x = 64;
      System.out.println( Math.sqrt(x)); 
      System.out.println("Start the program");
      drawLine('*', 10);
      System.out.println("Welcome to the first code in Function");
      drawLine('#', 20);
      System.out.println("End the program");

      int i , j;
      System.out.println("Enter two values: ");
      i = input.nextInt();
      j = input.nextInt();
       System.out.println(sum (i ,j));
       int total = 0;
       total = sum(i,j) * 5 / 10;
       System.out.println(total);

      input.close();
    }

    public static void drawLine(char x , int len) {

        for (int i = 1; i <= len; i++)
        {
            System.out.print(x);
        }
        System.out.println();
    }

    public static int sum (int x , int y)
    {
        int result = 0;
       result = x + y;
       return result;
    }
}
