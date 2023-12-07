public class ArrayTraversal {
    public static void main(String[] args) {
        
        int [] mark = {88,99,77,55};
        
        // Traverse Array using For Loop 
        System.out.println("Traversing Array using For loop");
        for(int i = 0 ; i < mark.length ; i++){
            System.out.println(mark[i]);
        }

        // Traverse Array using For each Loop 
        System.out.println("Traversing Array using For-each Loop:--");
        for (int i : mark) {
            System.out.println(i);
        }

        // Traverse Array using For Loop but in Reverse Order
        System.out.println("Traversing Array Using for loop in Reverse Order:--");
        for(int i=mark.length - 1 ; i>=0 ; i--){
            System.out.println(mark[i]);
        }
    }
}
