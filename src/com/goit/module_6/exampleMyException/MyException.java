package com.goit.module_6.exampleMyException;

public class MyException extends Exception{
    private String name;

    public MyException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
