import java.util.Scanner;

public class If_Else {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Age and check if you can Drive or Not ?...");
    int age = sc.nextInt();

    if (age>=18) {
        System.out.println("You can Drive !!...");
    }
    else{
        System.out.println("You Cannot Drive Yet !!...");
    }

    sc.close();
}    
}
