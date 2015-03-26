package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MyReader{
    public static String readFile(String path)throws Exception {
        FileReader fr;
        File myFile = new File(path);
        fr = new FileReader(myFile);
        BufferedReader br = new BufferedReader(fr);
        int len = (int)myFile.length();
        char file[] = new char[len];
        br.read(file,0,len);
        return new String(file);
    }
}
