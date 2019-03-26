/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NATHALY
 */
public class MenuTest {
    
     public static Menu m;
    @Test
    public void avion1() {
        String asientos = m.TestAvion(1);
        assertEquals("a1a2a3a4a5b1b2b3b4b5",asientos);   
    }
    @Test
    public void avion2() {
        String asientos = m.TestAvion(2);
        assertEquals("c1c2c3c4c5d1d2d3d4d5",asientos);
        
    }
    @Test
    public void avion3() {
        String asientos = m.TestAvion(3);
        assertEquals("a1b1c1d1f1",asientos);
        
    }
    
    
}
