package com.JavaAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileRead {
    public static void main(String[] args) {



    }

    public void read() throws FileNotFoundException {

        File file = new File("C:/Personal Projects/leisure Pursuit/leisure-pursuit/src/main/java/ReaderFile");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        
    }
}
