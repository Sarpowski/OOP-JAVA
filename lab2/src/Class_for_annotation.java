

public class Class_for_annotation {

    @My_Annotation(n = 1)
    public static void printHelloWorld() {
        System.out.println("No arg " );
    }
    @My_Annotation(n = 1)
    public static void printHelloWorld(String arg) {
        System.out.println("Hello , public access, my name is "+ arg );
    }

    @My_Annotation(n = 2)
    public static int N_times_int(int n){
        return n*n;
    }


    @My_Annotation(n=1)
    protected  static void printHelloProtected(String arg){
        System.out.println("Hello , protected access, my name is "+ arg);
    }
    @My_Annotation(n=2)
    protected static int N_times(int n){
        return n*n;
    }
    @My_Annotation(n=1)
    private static void witnessProtection(String name) {
        System.out.println("Hello ," +
                " private access , my name is "+ name);
    }
    @My_Annotation(n=2)
    private static double some_sum(double a, double b){
        return a+b;
    }

}