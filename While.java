import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int count = 1 ;
        int avg = 0 ;
        int grade = 0;

        while (count <= 6 && grade != -1)
        {
            System.out.println("Enter grade of student number " + count);
            grade = read.nextInt();
            avg += grade;

            count++ ;
        }
        
        System.out.printf("Average is %d",avg / 6);

        read.close();
    }
    
}
