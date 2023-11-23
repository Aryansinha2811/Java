import java.util.Scanner ;

public class string {
    public static void main(String[] args) {

        // ( WE HAVE TO COMMENT A PIECE OF CODE TO RUN A SINGLE CODE)
        Scanner sc = new Scanner(System.in);

        // This Line of Code will take Only first Word from the user 
        System.out.println("Enter a Word :--");
        String st = sc.next();
        System.out.print("The Word Entered by You is :-- ");
        System.out.println(st);

        // This Line of Code Will Take a Whole Line as a Input 
        System.out.println("Enter a Sentence :--");
        String sen = sc.nextLine();
        System.out.println("You Entered this Sentence :- ");
        System.out.println(sen);
    }
}
