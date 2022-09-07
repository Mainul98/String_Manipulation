package Function_Array;

import java.util.Arrays;

public class MyArraySort {
    public static void main(String[] args) {
        int num[]={5,8,9,3,1,7};
        //doSortAscendingOrder(num);
        doSortDescendingOrder(num);

    }
    public static void doSortAscendingOrder(int[] numbers){
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
    public static void doSortDescendingOrder(int[] numbers){
        Arrays.sort(numbers);
        for(int i=numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }

    }

}
