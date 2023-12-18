public class Methods {

        static int Add(int a, int b)
        {
            int c = a + b;
            return c;
        }

        static int Multiply(int a , int b){
            int c = a * b ;
            return c;
        }

        static int Logic(int a , int b){
            int c;
            if (a<b) {
             c = b - a ;
            }
            else{
                c = a - b;
            }
            return c ;
        }
    public static void main(String[] args) {
        int x = 10 , y = 20 ;
        System.out.println("Calling the Add Method :---");
        int z = Add(x, y);
        System.out.println(z);

        System.out.println("Calling the Multiply Method :---");
        int m = Multiply(y, x);
        System.out.println(m);

        System.out.println("Calling the Logic Method :---");
        int logic = Logic(m, z);
        System.out.println(logic);
    }
}
