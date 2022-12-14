
import org.example.ReBase64;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

public class TestClass {
    @org.junit.jupiter.api.Test
    void trueAssumption() {
        assumeTrue(5 > 1);
        assertEquals(ReBase64.decode("VHlwZWQ="), "Typed");
    }

    @org.junit.jupiter.api.Test
    void falseAssumption() {
        assumeFalse(5 < 1);
        assumeFalse(ReBase64.decode("VHlwZWQ=").equals("NotTyped"));
        assertEquals(5 + 2, 7);
    }
}
