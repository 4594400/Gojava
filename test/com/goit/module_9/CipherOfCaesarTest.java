package com.goit.module_9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CipherOfCaesarTest {
    CipherOfCaesar cipherOfCaesar;

    @Before
    public void setUp() throws Exception {
        cipherOfCaesar = new CipherOfCaesar();
    }

    @Test
    public void testEncrypt() throws Exception {
        String textToEncrypt = "Provides classes and interfaces for key specifications and algorithm parameter specifications.";
        String result = cipherOfCaesar.encrypt(textToEncrypt,5);
        assertEquals("Uwt{nijx%hqfxxjx%fsi%nsyjwkfhjx%ktw%pj %xujhnknhfyntsx%fsi%fqltwnymr%ufwfrjyjw%xujhnknhfyntsx3", result);
    }

    @Test
    public void testDecrypt() throws Exception {
        String textToDecrypt = "Uwt{nijx%hqfxxjx%fsi%nsyjwkfhjx%ktw%pj %xujhnknhfyntsx%fsi%fqltwnymr%ufwfrjyjw%xujhnknhfyntsx3";
        String result = cipherOfCaesar.decrypt(textToDecrypt, 5);
        assertEquals("Provides classes and interfaces for key specifications and algorithm parameter specifications.", result);
    }
}