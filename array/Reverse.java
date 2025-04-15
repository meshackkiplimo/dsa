package array;
public class Reverse {

public static void reverse(int[] numbers, int start, int end){
    while(start < end){
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
        start++;
        end--;
    }

} 



    public static void printArray(int[] arr){
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main (String[] args){
        int[] numbers = {1,3,4,5,7,8,11};
        printArray(numbers);
        reverse(numbers, 0, numbers.length-1);

        printArray(numbers);
    
}
}
