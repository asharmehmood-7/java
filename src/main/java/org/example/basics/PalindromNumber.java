package org.example.basics;

public class PalindromNumber {

    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String p="";
        for(int i = s.length(); i > 0; i--){
            p+=s.substring(i-1,i);
        }
        System.out.println(s.equals(p));
        return s.equals(p);

    }
}
