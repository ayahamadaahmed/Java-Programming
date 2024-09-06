public class Method_Ex1 {
    public static void main(String[] args) {
        int a = 10 , b = 20, c = 30 ;
       int tot = Sum (a , b , c) ; 
       double avg = Averag(a , b ,c); 
       print (avg , tot);
    }
    // this way is difficult
    /*public static int Sum (int x , int y , int z) {
        int Result = 0;
        Result = x + y + z;
        return Result; 
    }
    public static int Averag (int T) {
        int avg;
        avg = T / 3;
        return avg;   
    }*/
    //Another one 
    public static int Sum (int x , int y , int z) {
        return  (x + y + z );
    }
    public static double Averag (int x , int y , int z) {
        
        return Sum(x, y, z) / 3;
    }
    public static void print (double A , int S) {
        System.out.println("Sum of three numbers is " + S);
        System.out.println("Average of three numbers is " + A);
    }
}
