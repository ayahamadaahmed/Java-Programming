public class Overloading {
    public static void main(String[] args) {

       System.out.println( larger('a', 'A'));
       System.out.println(larger (4 , 3)); 
    }

    public static int larger (int x , int y)
    {
        if (x > y) return x;
        else return y;
    }

    public static char larger (char i , char j)
    {
        if (i > j) return i;
        else return j;
    }
}