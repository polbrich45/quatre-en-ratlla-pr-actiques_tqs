package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaulerTest {

	 @Test
	    public void testTaulerTe6Files() {
	        
	        Tauler tauler = new Tauler();
	        assertEquals(6, tauler.getFiles());
	    }
	 @Test
	 public void testTaulerTe7Columnes() {
	     Tauler tauler = new Tauler();
	     assertEquals(7, tauler.getColumnes());  
	 }

}
