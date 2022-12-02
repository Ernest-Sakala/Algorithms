package insertposition;

public class removeOccurrenceOfElement {


    public static int removeOccurrence(int[] nums, int target) {

        int arrayLength = nums.length;

        for(int i = 0; i <= nums.length - 1; i++){

            if(nums[i] == target){
                nums[i] = nums[i + 1];
                arrayLength = arrayLength - 1;
            }

        }


        return arrayLength;

    }
}
