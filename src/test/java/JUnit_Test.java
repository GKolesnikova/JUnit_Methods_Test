import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit_Test {


    @Test
    void UnitTest(){
        // Given
        int number1 = 50;
        int number2 = 50;

        // WHEN
        int x = JUnit.addieren(number1, number2);

        // THEN
        assertEquals(100, x);
    }
}
