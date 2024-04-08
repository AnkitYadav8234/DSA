package linearsearch;

import java.util.Arrays;

public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Ankit";
        char target = 'i';
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray());
        System.out.println(searchWithCharAt(name,'y'));
        System.out.println(searchWithtoCharArray(name,'t'));

    }

    static boolean searchWithtoCharArray(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.toCharArray().length;i++ ){
            if (str.toCharArray()[i] == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchWithCharAt(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if (target ==  str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
