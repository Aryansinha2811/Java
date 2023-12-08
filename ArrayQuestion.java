import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {

        // Problem 1 . Create a array and get the sum of their Elements

        int[] arr = { 50, 60, 70, 90 };
        int sum = 0;

        System.out.println("Elements Currently Present in the Array :--");
        for (int i : arr) {
            System.out.println(i);
        }
        
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("The Sum of Elements of Array:-- " + sum);

        // Problem 2. Wheather an integer is Present or Not ??....

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
            System.out.println("Element is Present in the Array !!");
        } else {
            System.out.println("Element Not Found !! 404");
        }

        sc.close();
    }
}
