package com.example.java;
import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.*;

/**
 * Created by Hiumathy on 4/24/17.
 */
public class Printtokens2Test {
    Printtokens2 pTest = new Printtokens2();
    BufferedReader br = pTest.open_character_stream("run.txt");

    @Test
    public void open_character_stream() throws Exception {
        assertEquals("hello", pTest.get_token(br));
    }
}