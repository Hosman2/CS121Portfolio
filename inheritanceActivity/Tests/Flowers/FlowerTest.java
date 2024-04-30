package Flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    @Test
    void getNumOfPetalss() {
        Lily lily = new Lily("Lily", "yellow", 9, 14, "Small");
        assertEquals(9,lily.getNumOfPetals());

    }
}