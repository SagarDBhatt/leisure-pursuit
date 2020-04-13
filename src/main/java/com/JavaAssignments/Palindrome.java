package com.JavaAssignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a String = ");
        String str = sc.nextLine();

        Palindrome obj = new Palindrome();
        obj.isPalindrome(str);
    }

    public void isPalindrome(String s){
        char[] reverse = new char[s.length()];
/*
        for(int index = s.length()-1; index >= 0; index--){
            reverse[index] = s.charAt(s.length()-index-1);
        }*/
        for(int index = 0; index < s.length(); index++){
            reverse[index] = s.charAt(s.length()-index-1);
        }
        String rev = new String(reverse);

        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");

        else
            System.out.println("Not Palindrome");
    }

}
