import java.util.Scanner;

public class QuestionSet2 {
    public static void main(String[] args) {

        // Question 2:----
        /* Calculate the Income Tax paid by an Employee to Government as per the Tax Slab Mentioned Below :--
        Income Slab            TAX 
        2.5 to 5.0 lakh ----    05%
        5.0 to 10.0 Lakh ---    20%
        10.0 Laks & Above ---   30%   
           */

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the annual income: ");
//         double income = sc.nextDouble();

//         double tax = 0;

//         if (income >= 250000 && income <= 500000) {
//             tax = (income - 250000) * 0.05;
//         } else if (income > 500000 && income <= 1000000) {
//             tax = 12500 + (income - 500000) * 0.20;
//         } else if (income > 1000000) {
//             tax = 12500 + 100000 + (income - 1000000) * 0.30;
//         }

//         System.out.println("The income tax payable is: " + tax);
//     }
// }

        double income ;
        float tax = 0;
        System.out.println("Enter your Income to Find the Tax that will pe Applied to your Pay :-");
        income = sc.nextDouble();

        if (income <= 250000) {
            tax = tax + 0; 
        }  
        else if (income > 250000 && income <=500000) {
            tax = (float) (tax + 0.05f * (income - 250000))  ;
        }
        else if (income > 500000 && income <= 1000000) {
            // tax = tax + 0.05f * (500000 - 2500000); 
            tax = (float) (tax + 0.2f * (income - 500000)) ;
        }
        else if (income > 1000000) {
        //    tax = tax + 0.05f * (500000 - 2500000); 
        //    tax = (float) (tax + 0.2f * (1000000 - 500000)) ; 
           tax = (float) (tax + 0.3f * (income - 1000000));
        }

        System.out.println("Total Tax Paid by Employee is :--" + tax);
        } else {
            income = (income) * 2.0d ;
            System.out.print("You Have to Pay the Tax of 20% \nWhich is :--");
            System.out.println(income);
        }
        if (1000000 < 100000000) {
            income = (income) * 3.0d ;
            System.out.print("You Have to Pay the Tax of 30% \nWhich is :--");
            System.out.println(income);
        }
            

    }
}
