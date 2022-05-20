import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static java.lang.Double.sum;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testing the Average Method")
class AverageMethodTest {
    @Nested
    @DisplayName("Testing the Main Method")
    @org.junit.jupiter.api.Test
    void checkMainMethodPrintout() {
        assertEquals("The sum is: 15.0", "The sum is: " + AverageMethod.sum(2,5,8) );
        assertEquals("The average is: 5.0", "The average is: " + AverageMethod.average(2,5,8));
    }
    @Nested
    @DisplayName("Testing the Sum Method")
    @org.junit.jupiter.api.Test
    void checkSum() {
        assertEquals(130,AverageMethod.sum(25,59,46));
    }
    @Nested
    @DisplayName("Testing the Average Method")
    @org.junit.jupiter.api.Test
    void checkAverage() {
        assertEquals(5,AverageMethod.average(5,5,5));
    }
}