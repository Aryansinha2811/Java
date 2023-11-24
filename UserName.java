import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        System.out.println("What is Your Name ??....");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " Have a Nice Day !!...");

        System.out.println("What is Your Age ?....");
        int age = sc.nextInt();
        System.out.println("Age Entered by you is " + age);
        sc.close();
    }
}
