package Flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LilyTest {

    @Test
    void testingToString(){
        Lily lily = new Lily("Lily", "yellow", 9, 14, "Small");
        assertEquals("Size Small", lily.toString());
    }
}