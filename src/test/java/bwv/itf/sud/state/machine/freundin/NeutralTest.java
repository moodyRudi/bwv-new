package bwv.itf.sud.state.machine.freundin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NeutralTest {

    private FreundinStatus status;

    @BeforeEach
    void setUp() {
        status = new Neutral();
    }

    @Test
    @DisplayName("kuessen: Der Status sollte sich ändern.")
    void testKuessen() {
        assertTrue(status.kuessen() instanceof Froehlichkeit);
    }

    @Test
    @DisplayName("veraergern: Der Status sollte sich ändern.")
    void testVeraergern() {
        assertTrue(status.veraergern() instanceof Bockigkeit);
    }

}
