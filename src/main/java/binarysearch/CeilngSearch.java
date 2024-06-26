package binarysearch;

public class CeilngSearch {
    public static void main(String[] args) {
        int[] arr = {2,5,9,14,16,18};
        int target = 16;
        int ans = binarSearch(arr,target);
        System.out.println(ans);
    }

    private static int binarSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        if(target>arr[arr.length-2]){
            return -1;
        }

        while (start<=end){
            int mid = start + (end-start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }

}