package ca.csfoy.coderetreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    @Test
    public void canAddTwoNumbers() {
        int result = Math.sum(1, 2);

        assertEquals(3, result);
    }

    @Test
    public void testThatFails() {
        fail("This test should fail");
    }
}