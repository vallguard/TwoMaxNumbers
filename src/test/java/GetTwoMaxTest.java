import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTwoMaxTest {

    @Test
    void checkGetTwoMaxNumbers() {
        assertEquals(Program.GetTwoMaxNumbers(new int[]{5, 3, 7, 3, 6, 2, 1,-5}), "Array has two maximums: 6, 7");
        assertEquals(Program.GetTwoMaxNumbers(new int[]{6}), "Array has only one maximum: 6");
        assertEquals(Program.GetTwoMaxNumbers(new int[]{-99, -99, 200, 44, 200, 5, 6}), "Array has two maximums: 200, 200");

    }

}
