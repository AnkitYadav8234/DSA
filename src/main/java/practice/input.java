package practice;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //arrays of primitives
        int[] arr = new int[5];

//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 233;
//        arr[3] = 543;
//        arr[4] = 3;

        //Access value using index
        //System.out.println(arr[4]);

        /*// input using for loops
        for (int i = 0; i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
       // System.out.println(Arrays.toString(arr));
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        for (int num : arr){
            System.out.print(num+ " ");
        }*/

        String[] str = new String[5];
        for (int i = 0; i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[0] = "Ankit";
        System.out.println(Arrays.toString(str));
    }
}
