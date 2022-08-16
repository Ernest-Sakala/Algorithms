import bubblesort.BubbleSort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int [] numbers = {4 , 8, 1, 9 ,7};
        BubbleSort.bubbleSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
