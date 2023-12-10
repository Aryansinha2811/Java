public class ArrayQuestion2 {
    public static void main(String[] args) {
        // Problem 1 :--- Reverse an Array 

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
    }
}

