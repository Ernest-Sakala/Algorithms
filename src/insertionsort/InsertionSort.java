package insertionsort;

public class InsertionSort {



    public static void insertionSort(int [] values){

        for(int start = 1; start < values.length; start++){

            int current  = values[start];

            for(int compare = 0; compare < start; compare++){

                int compareValue = values[compare];
                if(compareValue > current){
                    values[compare] = current;
                    values[start] = compareValue;
                    break;
                }
            }
        }
    }
}
