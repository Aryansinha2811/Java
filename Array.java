public class Array {
    public static void main(String[] args) {
        // Three main Array Declation and Initialition Method 

        // 1. Declartion and Intialition at a place 
        System.out.println("Entering and Displaying Elements using the Most Straight Forward Method");
        System.out.println("Declartion and Intialition at a place");
        int [] marks = {40 ,50 , 60 , 70};
        System.out.println( "Printing Array's Third Element :-- "+marks[2] +"\n");

        // 2.Declartion and then Memory Allocation
        System.out.println("Entering and Displaying Elements using the Naieve Method");
        System.out.println("Declartion and then Memory Allocation");
        int [] marks1 ;
        marks1 = new int[5] ;
        marks1[0]= 91 ;
        marks1[1]= 92 ;
        marks1[2]= 95 ;
        marks1[3]= 97 ;
        marks1[4]= 99 ;
        System.out.println("Printing Array's Fifth Element :-- "+marks1[4]+"\n");

        // 3. Declartion and Memory Allocation
        System.out.println("Entering and Displayimg Elements using the Naieve Method");
        System.out.println("Declartion and Memory Allocation");
        int [] marks2 = new int[4];
        marks2[0]= 91 ;
        marks2[1]= 92 ;
        marks2[2]= 95 ;
        marks2[3]= 97 ;
        System.out.println("Printing Array's Third Element :-- "+marks2[2]+"\n");


    }
}
