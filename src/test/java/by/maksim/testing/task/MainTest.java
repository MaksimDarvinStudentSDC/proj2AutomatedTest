package by.maksim.testing.task;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "5, 3, 5, 3, Infinite number of intersection points (identical circles)",
            "5, 3, 5, 2, 0 intersection points (one circle inside the other)",
            "0, 2, 5, 3, 1 intersection point (external tangency)",
            "0, 4, 5, 3, 2 intersection points",
            "0, 5, 3, 2, 1 intersection point (internal tangency)",
            "0, 5, 2, 1, 0 intersection points (one circle inside the other)",
            "0, 2, 10, 1, 0 intersection points (circles too far apart)",
            "1, 4, 7, 2, 1 intersection point (external tangency)",
            "0, 1, 2, 1, 1 intersection point (external tangency)",
            "10, 3, 13, 3, 2 intersection points",
            "4, 2, 8, 1, 0 intersection points (circles too far apart)",
            "100, 50, 150, 50, 2 intersection points"
    })
    void testIntersections(int x1, int r1, int x2, int r2, String expected) {
        Circle c1 = new Circle(x1, r1);
        Circle c2 = new Circle(x2, r2);
        String result = Main.getIntersection(c1, c2);
        assertEquals(expected, result);
    }
}