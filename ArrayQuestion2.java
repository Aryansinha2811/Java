import org.w3c.dom.ls.LSOutput;

public class ArrayQuestion2 {
    public static void main(String[] args) {
        // Problem 1 :--- Reverse an Array 
        System.out.println("Problem 1 Solution ");
        int [] arr = { 2,3,4,5,6,7,8 };
        System.out.println("Current Array is :--");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int l = arr.length ;
        int n = Math.floorDiv(l, 2); 
        int temp ;

        for(int i = 0 ; i<n ; i++){
            temp = arr[i] ;
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp ;
        }

        System.out.println(" ");
        System.out.println("----- Reversed Array is :-----");

        for (int result  : arr) {
            System.out.print(result + " ");
        }
        System.out.println("\n ");

        // Problem 2 . Find the maximum in the Array ------
        System.out.println("Problem 2 Solution ");
        System.out.println("Current Array is :---");
        int [] array = {99, 48 , 67 , 106 , 11} ;
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.err.println("\n");
        int max = 0 ;

        for (int  e: array) {
            if (e>max) {
                max=e;
            }
        }


        System.out.println("The Maximum Value of Array is : " + max);
    }

}

