import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 , num2 ;

        System.out.print("Enter a Number :-");
        num1 = sc.nextInt();

        System.out.print("Enter a Number :-");
        num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Product");
        System.out.println("4. Divide");
        System.out.println("Enter a Number Between 1 to 4 to perform a Basic Math Operation :--");
        byte num = sc.nextByte();

        switch (num) {
            case 1:
                int sum = num1 + num2 ;
                System.out.print("Addition of " +num1 + " + " +num2+ " is :-");
                System.out.println(sum);
                break;
        
            case 2:
                int sub = num1 - num2 ;
                System.out.print("Substraction of " +num1 + " - " +num2+ " is :-");
                System.out.println(sub);
                break;

            case 3:
                int multiply = num1 * num2 ;
                System.out.print("Product of " +num1 + " * " +num2+ " is :-");
                System.out.println(multiply);
                break;

            case 4:
                int divide = num1 / num2 ;
                System.out.print("Divide of " +num1 + " + " +num2+ " is :-");
                System.out.println(divide);
                break;

            default:
            System.out.println("You Entered a Wrong Choice");
                break;
        }

        System.out.println("Thanks For Using our Program !!..");
        sc.close();

    }
}
