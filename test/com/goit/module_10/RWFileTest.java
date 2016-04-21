package com.goit.module_10;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.StringWriter;

import static org.junit.Assert.*;


public class RWFileTest {
    RWFile rwFile;
    String fileName = "out.txt";
        String text = "Codewars is where developers achieve code mastery through challenge.";

    @Before
    public void setUp() throws Exception {
        rwFile = new RWFile();
    }

    @Test
    public void testWriteToFile() throws Exception {
        rwFile.writeToFile(fileName, text);
        String result = rwFile.readFromFile(fileName);
        assertEquals(text, result);
    }

    @Test
    public void testExistingFile() throws Exception {
        File file = new File(fileName);
        assertTrue(file.exists());
    }

    @Test
    public void testReadFromFile() throws Exception {
        String result = rwFile.readFromFile(fileName);
        assertEquals(text, result);
    }
}