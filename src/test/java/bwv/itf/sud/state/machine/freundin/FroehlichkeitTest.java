package bwv.itf.sud.state.machine.freundin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FroehlichkeitTest {

    private FreundinStatus status;

    @BeforeEach
    void setUp() {
        status = new Froehlichkeit();
    }

    @Test
    @DisplayName("kuessen: Es sollte ein Fehler auftreten.")
    void testKuessen() {
        assertThrows(UnsupportedOperationException.class, () -> status.kuessen());
    }

    @Test
    @DisplayName("veraergern: Der Status sollte sich ändern.")
    void testVeraergern() {
        assertTrue(status.veraergern() instanceof Bockigkeit);
    }

}
