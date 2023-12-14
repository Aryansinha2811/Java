import java.util.Scanner;

public class QuestionSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1 :----
       /*  Write a Program to Find Out whether a Student is Pass or Fail : if it requires a total of 
        40% & at least 33% in Each Subject to Pass . Assume there is 3 Subjects , Take Input from user 
        to find Out !!.. */

        byte m1, m2, m3;
        System.out.println("Enter Your Marks in the Following Subjects :-");

        System.out.println("Physics :-");
        m1 = sc.nextByte();

        System.out.println("Chemstry :-");
        m2 = sc.nextByte();

        System.out.println("Mathematics :-");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;

        System.out.print("You Have Scored a Total of :-- ");
        System.out.println(avg);

        if (avg >= 33 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations !!... You've Passed !!...");
        } else {
            System.out.println("You've Failed !!... Try Hard Next Time .");
        }

        sc.close();
    }
}
