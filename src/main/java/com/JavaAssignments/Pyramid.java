package com.JavaAssignments;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Pyramid aObj = new Pyramid();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        aObj.star(n);
    }

    public void star(int n){
        for(int i=1;i<=n;i++){
            for(int j = (2*(n-i) + 1)/2; j>0; j-- ){
                System.out.print(" ");
            }

            for(int j=1;j<= 2*i - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}//end of class
