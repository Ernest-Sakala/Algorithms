package selectionsort;

public class SelectionSort {

    public static void selectionSort(int [] values){

        for(int i = 0; i < values.length; i++){

            int min = i;

            for(int j = i; j < values.length; j++){
                if(values[j] < values[min])
                    min = j;
            }

            int temp = values[i];
            values[i] = values[min];
            values[min] = temp;

        }
    }
}
