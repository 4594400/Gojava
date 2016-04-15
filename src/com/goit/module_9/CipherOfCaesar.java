package com.goit.module_9;


import java.util.ArrayList;
import java.util.List;

public class CipherOfCaesar {
    private List<Character> alphabet = new ArrayList<>();

    public CipherOfCaesar() {
        for (char i = ' '; i <= '}'; i++) {
            alphabet.add(i);
        }
    }

    public List<Character> getAlphabet() {
        return alphabet;
    }

    public String encrypt(String text, int offset) {
        int n = alphabet.size();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index + offset) % n;
            stringBuilder.append(alphabet.get(index));
        }
        return stringBuilder.toString();
    }

    public String decrypt (String text, int offset){
        int n = alphabet.size();
        return encrypt(text, n-offset);
    }
}
