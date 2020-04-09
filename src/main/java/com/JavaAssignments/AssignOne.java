package com.JavaAssignments;

import javax.swing.*;

public class AssignOne {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        AssignOne object = new AssignOne();
        object.table(n);

    }//end of main()

    public void table(int n){

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

}//end of class
