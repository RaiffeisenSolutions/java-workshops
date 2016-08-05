package pl.raiffeisensolutions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubtracterTest {
    Subtracter subtracter;

    @Before
    public void setUp() throws Exception {
        subtracter = new Subtracter();
    }

    @Test
    public void shouldSubtractNumbersCorrectly() {
        // when
        int subtract = subtracter.subtract(10, 3);

        // then
        assertEquals(7, subtract);
    }

    @Test
    public void shouldSubtractAnotherNumbersCorrectly() {
        // when
        int subtract = subtracter.subtract(18, 8);

        // then
        assertEquals(10, subtract);
    }


}