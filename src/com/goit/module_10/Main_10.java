package com.goit.module_10;


import com.goit.module_9.CipherOfCaesar;

import java.io.*;

public class Main_10 {
    public static void main(String[] args) throws IOException {
        String text = "Codewars is where developers achieve code mastery through challenge.";
        String fileName = "out.txt";
        RWFile rwFile = new RWFile();
        CipherOfCaesar cipherOfCaesar = new CipherOfCaesar();

        rwFile.writeToFile(fileName, cipherOfCaesar.encrypt(text, 5));

        System.out.println(cipherOfCaesar.decrypt(rwFile.readFromFile(fileName), 5));

    }
}



