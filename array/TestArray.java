public class TestArray {
    public static void main(String[] args) {
        int [] array ={10,20,30,40,50};
        // access operation
        int firstElement = array[0];
        System.out.println("accessing first element in an array = " + firstElement);

        // insertion opertion
        array [2] =35;
        System.out.println("inserting 35 at index 2 = " + array[2]);
        // deletion operation
        array[0]=0;

        // traversal operation
        System.out.println("traversing the array = ");
        for (int i =0 ;i<array.length;i++){
            System.out.println("traversing the array = " + array[i]);


        }
        // seraching opetration

        System.out.println("searching the array for 95 ");
        for (int i = 0; i <array.length; i++){
            if(array[i] == 95){
                System.out.println("95 is found at index " + i);
            }else {
                System.out.println("95 is not found at index " + i);
            }

            System.out.println("print all the state of aerray after operation");
            for(int value:array){
                System.out.println("array = " + value);
            }

        }






    
    }
}
