package array;

public class Print {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // To move to the next line after printing the array
    }

    public static void main(String[] args) {
        // Create an instance of the Print class
        Print printInstance = new Print();

        // Define an array to test the printArray method
        int[] testArray = {1, 2, 3, 4, 5};

        // Call the printArray method with the testArray
        printInstance.printArray(testArray);
    }
}
