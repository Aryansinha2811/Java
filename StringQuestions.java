import java.util.Scanner;

public class StringQuestions {
    public static void main(String[] args) {
        
        // Problem 1 :- Convert a UpperCase Sentence To LowerCase 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence in a UpperCase Below :-");
        String st = sc.nextLine();
        System.out.println("Entered Sentence by You is :-");
        System.out.println(st);
        System.out.println("In Lower Case :--");
        String lc = st.toLowerCase();
        System.out.println(lc);

        // Problem 2 :- Replace a Space( ) by Underscore (_)
        System.out.println("Replacing Blank Space by a UnderScore (_) ");
        st = st.replace(" " , "_");
        System.out.println(st);
        sc.close();
    }
}
