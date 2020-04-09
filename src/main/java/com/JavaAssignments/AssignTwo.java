package com.JavaAssignments;

import javax.swing.*;

public class AssignTwo {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows: "));

        AssignTwo obj = new AssignTwo();
        obj.star(n);
    }

    /**
     * This method presents draw a star patten based on number provided in a param
     * @param n
     */
    public void star(int n){
        for(int i =1; i<= n ; i++){
            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
