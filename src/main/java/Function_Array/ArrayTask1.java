package Function_Array;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] arr={2,6,9,8,7,1,5};
        int maxNumber= findMax(arr);
        int minNumber= findMin(arr);
        System.out.println(maxNumber);
        System.out.println(minNumber);

    }
    public static int findMax(int[] numbers){
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
    public static int findMin(int[] numbers){
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }
}
