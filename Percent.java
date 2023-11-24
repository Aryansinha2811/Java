import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks Out of 100 Below :-");

        System.out.print("Maths :-");
        float a = sc.nextFloat();

        System.out.print("English :-");
        float b = sc.nextFloat();

        System.out.print("Science :-");
        float c = sc.nextFloat();

        System.out.print("Social Studies :-");
        float d = sc.nextFloat();

        sc.close();

        float sum = a + b + c + d ;
        System.out.println("The Sum of These 4 Subjects are :- " + sum);

        float percent = (sum/400)*100 ;
        System.out.println("Your Percent in 4 Subjects are :- " + percent);
    }
}
