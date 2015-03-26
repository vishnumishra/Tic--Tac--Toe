package com.company;

public class Banner {
    public void showInstruction(){
        try {
            System.out.println(MyReader.readFile("test/Data/Banner"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
