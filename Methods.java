public class Methods {

        static int add(int a, int b)
        {
            int c = a + b;
            return c;
        }

        static int multiply(int a , int b){
            int c = a * b ;
            return c;
        }
    public static void main(String[] args) {
        int x = 10 , y = 20 ;

        int z = add(x, y);
        System.out.println(z);

        int m = multiply(y, x);
        System.out.println(m);
    }
}
