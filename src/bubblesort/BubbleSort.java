package bubblesort;

public class BubbleSort {


    public static void bubbleSort(int [] numbers){

        boolean sorted = true;

        for(int i =0; i < numbers.length - 1; i++){



            for(int x = 0; x < numbers.length -1; x++){
                int number = numbers[x];
                if(numbers[x + 1] < numbers[x]){
                    sorted = false;
                    numbers[x] = numbers[x +1];
                    numbers[x + 1] = number;
                }
            }

            if(sorted)
                break;
        }
    }


}
