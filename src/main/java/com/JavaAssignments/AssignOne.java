package com.JavaAssignments;

import javax.swing.*;

public class AssignOne {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        AssignOne object = new AssignOne();
        object.table(n);

    }//end of main()

    /**
     * This method is used to present a table by providing the number as a param.
     * @param n
     */
    public void table(int n){

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

}//end of class
