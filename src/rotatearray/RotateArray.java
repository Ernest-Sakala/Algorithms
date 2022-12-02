package rotatearray;

public class RotateArray {


    public static int [] rotateArray(int [] numbers, int rotation){


        int [] newArray = new int[numbers.length];

        int index = 0;

        int startIndex = numbers.length - rotation;

        for(int i = startIndex; i < numbers.length; i++){
            newArray[index] = numbers[i];
            index++;
        }

        int  firstIndex = rotation;
        for(int i = 0; i < startIndex; i++){
            newArray[firstIndex] = numbers[i];
            firstIndex++;
        }

        return newArray;
    }

}
