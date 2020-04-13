package com.JavaAssignments;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new 
    }

    public void isPalindrome(String s){
        char[] reverse = new char[s.length()];

        for(int index = s.length(); index > 0; index--){
            reverse[index] = s.charAt(s.length()-index);
        }
        String rev = new String(reverse);

        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");

        else
            System.out.println("Not Palindrome");
    }

}
