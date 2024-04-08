package linearsearch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,34};
        System.out.println(digits2(43643));

        System.out.println(findNumbers(nums));

    }


    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even2(int num){
        int numberOfDigits =  digits(num);
     return numberOfDigits % 2 == 0;
    }
    static boolean even(int num){
        int numberOfDigits =  digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }



    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num)+1);
    }
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

}
