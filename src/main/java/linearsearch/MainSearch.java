package linearsearch;

public class MainSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 18,19, -3, 16, -11, 28};
        int target = 18;
      //  boolean ans = linearSearch1(nums, target);
        System.out.println(linearSearchIndex(nums, target));
        System.out.println(linearSearchElement(nums, target));
        System.out.println(linearSearchBoolean(nums, target));
    }

    static boolean linearSearchBoolean(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i <arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    // search the target and return the element
    static int linearSearchElement(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }


    // search in the array: return the index if item found
    // otherwise if item not found return -1
     static int linearSearchIndex(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
