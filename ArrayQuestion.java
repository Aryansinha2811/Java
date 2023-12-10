import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {

        // Problem 1 . Create a array and get the sum of their Elements
        System.out.println("Problem 1 Solution");
        int[] arr = { 50, 60, 70, 90 };
        int sum = 0;

        System.out.println("Elements Currently Present in the Array :--");
        for (int i : arr) {
            System.out.println(i);
        }
        
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("The Sum of Elements of Array:-- " + sum + "\n");
        System.out.println("Problem 2 Solution ");

        // // Problem 2. Wheather an integer is Present or Not ??....

        int[] arr1 = { 99, 66, 77, 88 };
        System.out.println("Elements Currently Present in the Array :--");
        for (int i : arr1) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to see if it is Present in the Array or not ?...");
        int s = sc.nextInt();

        boolean isInArray = false;

        for (int i : arr1) {
            if (s == i) {
                isInArray = true;
            }
        }

        if (isInArray) {
            System.out.println("Element is Present in the Array !!" + "\n");
        } else {
            System.out.println("Element Not Found !! 404" + "\n");
        }

        sc.close();

        // Problem 3. Create a Program to add two Matrix of size 2x3 ----------

        System.out.println("Problem 3 Solution");
        int [] [] marks = {{ 1, 2 , 3 ,
                             4 , 5 , 6 }};
                             
        int [] [] marks2 = {{ 2, 4 ,6 ,
                              4 , 7 , 9 }};

        int [] [] result = {{ 0, 0 , 0  ,
                              0, 0 , 0 }}; 

        for(int i = 0; i < marks.length ; i++){
            for(int j = 0; j < marks[i].length ; j++){
                System.out.printf("Setting Value of i = %d and j = %d\n" , i ,j );
                result [i][j]= marks[i][j] + marks2[i][j] ;
            }
        }

        for(int i = 0; i < marks.length ; i++){
            for(int j = 0; j < marks[i].length ; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
