public class Local_Global {

    static int globalvar;
    public static void main(String[] args) {
        globalvar = 100;

        int globalvar; // hide for global 
        globalvar = 500;
        System.out.println(globalvar);
        System.out.println(Local_Global.globalvar);
        print();

        int local;
        {
            int x = 100;
            local = 9;
            System.out.println(x);
        }
        System.out.println(local);
        // x = 200 it will be error
        
    }

    public static void print()
    {
        System.out.println(globalvar);
    }
    
}
