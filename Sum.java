import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);

        System.out.println("Enter a New Number :-");
        int a = ar.nextInt();
        // We can also take a float Number 
        
        System.out.println("Enter a New Number :-");
        int b = ar.nextInt();

        int sum = a + b ;

        System.out.print("The Sum of Two Numbers Given by You is :-- ");
        System.out.println(sum);
        ar.close();
    }
}
