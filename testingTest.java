package Modul_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testingTest {

    @Test
    public void testFindMin_PositiveNumbers() {
        assertEquals(1, testing.findmin(1, 2, 3));
    }

    @Test
    public void testFindMin_NegativeNumbers() {
        assertEquals(-3, testing.findmin(-1, -2, -3));
    }
    
    @Test
    public void testFindMin_ZeroAndPositive() {
        assertEquals(0, testing.findmin(0, 0, 1));
    }
}
