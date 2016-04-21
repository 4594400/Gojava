package com.goit.module_9;


import com.goit.module_8.*;

import static com.goit.module_8.Main.createListOfInstruments;

import java.util.List;


public class Main_9 {
    public static void main(String[] args) {
        CipherOfCaesar cipherOfCaesar = new CipherOfCaesar();
        System.out.println("Alphabet: "+ cipherOfCaesar.getAlphabet().toString());

        MusicStore musicStore = new MusicStore();
        List<MusicalInstrument> musicalInstruments = createListOfInstruments();
        musicStore.setInstruments(musicalInstruments);

        String encryptedText = cipherOfCaesar.encrypt(musicStore.getInstruments().toString(), 12);


        System.out.println("Encrypted: " + encryptedText);
        System.out.println("Decrypred: " + cipherOfCaesar.decrypt(encryptedText, 12));
    }


}

