package bubblesort;

public class BubbleSort {


    public static void bubbleSort(int [] numbers){

        for(int i =0; i < numbers.length - 1; i++){

            for(int x = 0; x < numbers.length -1; x++){
                int number = numbers[x];
                if(numbers[x + 1] < numbers[x]){
                    numbers[x] = numbers[x +1];
                    numbers[x + 1] = number;
                }
            }
        }
    }
}
