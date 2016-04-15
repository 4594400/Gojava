package com.goit.module_10;

import java.io.*;

public class RWFile {
    public void writeToFile(String fileName, String text){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(fileName)))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile(String fileName) {
        File file = new File(fileName);
        StringBuilder stringBuilder= new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader((file.getAbsoluteFile())))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("|ERROR| File '" + file.getName() + "' not found!" );
        } catch (IOException ioe) {
            System.out.println("File read error! ");
            ioe.printStackTrace();
        }
        return stringBuilder.toString();

    }
}
