import java.util.Scanner;
public class Array_Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int size = 0 ;
        System.out.println("Enter size of array ");
        size = input.nextInt();

        int[]array = new int[size];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Enter Posistive numbers ");
            array[i] = input.nextInt();
        }
        int sum = 0 , count = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0)
            {
                sum += array[i];
                count ++;
            }

        }
        avg = (sum /count);
        System.out.println("Sum of array is " + sum);
        System.out.println("Average of array is " + avg);
        input.close();
    }
    
}
