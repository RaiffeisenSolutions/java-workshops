package pl.raiffeisensolutions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdderTest {
    Adder adder;

    @Before
    public void setUp() throws Exception {
        adder = new Adder();
    }

    @Test
    public void shouldAddNumbersCorrectly() {
        // when
        int sum = adder.add(1, 2);

        // then
        assertEquals(3, sum);
    }

    @Test
    public void shouldAddAnotherNumbersCorrectly() {
        // when
        int sum = adder.add(5, 10);

        // then
        assertEquals(15, sum);
    }
}