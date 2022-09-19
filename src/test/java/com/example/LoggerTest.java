/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1937512
 */
public class LoggerTest {

    public LoggerTest() {
    }

    @Test
    public void testSomeMethod() {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        assertEquals(log1, log2);
    }
}


