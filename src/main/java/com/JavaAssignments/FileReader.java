package com.JavaAssignments;

import java.io.*;

class FileRead {
    public static void main(String[] args) throws IOException {
        FileRead obj = new FileRead();
        obj.read();
    }

    public void read() throws IOException {
        String str = null;
        File file = new File("C:/Personal Projects/leisure Pursuit/leisure-pursuit/src/main/java/ReaderFile");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

       while((str = br.readLine()) != null){
            System.out.println(str);
        }
    }
}
