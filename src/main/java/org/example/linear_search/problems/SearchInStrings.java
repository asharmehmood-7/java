package org.example.linear_search.problems;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "ashar";
        char target = 'a';
        System.out.println(linearSearchString(name,target));
        System.out.println(linearSearchString(name,'w'));

    }
    static boolean linearSearchString(String str, char target){
        if (str.length() == 0){
            return  false;
        }
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }


    static boolean linearSearchString2(String str, char target){
        if (str.length() == 0){
            return  false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return  true;
            }
        }
        return false;
    }
}
