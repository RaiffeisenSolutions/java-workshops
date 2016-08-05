package pl.raiffeisensolutions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplerTest {
    Multipler multipler;

    @Before
    public void setUp() throws Exception {
        multipler = new Multipler();

    }

    @Test
    public void shuldMultiplyAnotherNumbersCorrectly() {
        // when
        int multiply = multipler.multiply(2, 5);

        // then
        assertEquals(10, multiply);
    }

    @Test
    public void shuldMultiplyNumbersCorrectly() {
        // when
        int multiply = multipler.multiply(6, 3);

        // then
        assertEquals(18, multiply);
    }

}