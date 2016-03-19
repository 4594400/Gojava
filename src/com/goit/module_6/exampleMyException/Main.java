package com.goit.module_6.exampleMyException;


public class Main {
    public static void main(String[] args) {
        Pianist pianist = new Pianist();

        try {
            pianist.play(new Piano("Currier & Gilbert"));
            pianist.play(new Guitar("Gibson Les Paul Solid Body Electric Guitar"));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
