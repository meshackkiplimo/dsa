public class ArrayTraversal {
    public static void printArray(int[] arr) {
        int n =arr.length; // Define an array of integers
        for (int i = 0; i < arr.length; i++) { // Loop through the array
            System.out.println("Element at index " + i + ": " + arr[i]); // Access and print each element
        }
         System.out.println();

        



    }
    public static int[] removeEven(int[]arr){
        int addCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                addCount++;
              
            }
        }
        int[] result = new int[addCount];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,55,77,97,59};
        printArray(arr);
        int []result =removeEven(arr);
        printArray(result);
        
    }
}
