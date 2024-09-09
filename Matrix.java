import java.util.Scanner;
public class Matrix {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] array = new int[5][3];

        fillarray(array);
        System.out.println("Array is failled");

        System.out.println("Array will be printed");
        printarray(array);

        int total = Sumarray(array);
        System.out.println("Total sum of array is " + total);
    }


    public static void fillarray(int[][] list)
    {
        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[0].length; col++)
            {
                System.out.println("Enter values of row No " + (row+1) +" and column No " +(col+1));
                list[row][col]= input.nextInt();
            }
    }
    public static void printarray(int[][] list)
    {
        for (int row = 0; row < list.length; row++)
        {
            for (int col = 0; col < list[0].length; col++)
            {
                System.out.print(list[row][col]+"\t" );
            }
            System.out.println();
          }  
    }
    public static int Sumarray(int[][] list)
    {
        int sum = 0;
        for (int row = 0; row < list.length; row++)
            for (int col = 0; col < list[0].length; col++)
            {
                sum += list[row][col];
            }
            return sum;
    }
   

    
}
