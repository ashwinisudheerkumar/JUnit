import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(-1, MathUtils.add(-2, 1));
    }

    @Test
    void subtract() {
        assertEquals(1, MathUtils.subtract(3, 2));
        assertEquals(-3, MathUtils.subtract(0, 3));
    }

    @Test
    void multiply() {
        assertEquals(6, MathUtils.multiply(2, 3));
        assertEquals(0, MathUtils.multiply(0, 5));
    }

    @Test
    void divide() {
        assertEquals(2.5, MathUtils.divide(5, 2), 0.0001);
        assertEquals(-1.0, MathUtils.divide(10, 0), 0.0001); // Division by zero
        // Add more test cases
    }
}