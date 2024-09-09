public class Array_two_dimension {

    public static void main(String[] args) {
        
        int [][] marks = new int[20][25];
        System.out.println("No.of rows = " + marks.length );
        System.out.println("No.of columns = " + marks[0].length ); //Zero is refer to no.of rows you can choose row 1 or 2 as you like

        int [][] array = {{1, 2, 4, 70}, {9, 5, 8, 30},{75, 80, 95, 100}};
        System.out.println(array.length);
        System.out.println(array[0].length);
    }
    
}
