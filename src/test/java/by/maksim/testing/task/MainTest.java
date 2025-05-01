package by.maksim.testing.task;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/tests_data.csv", numLinesToSkip = 1)
    void testIntersections(int x1, int r1, int x2, int r2, String expected) {
        Circle c1 = new Circle(x1, r1);
        Circle c2 = new Circle(x2, r2);
        String result = Main.getIntersection(c1, c2);
        assertEquals(expected, result);
    }
}