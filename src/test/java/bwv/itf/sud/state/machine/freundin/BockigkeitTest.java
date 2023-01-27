package bwv.itf.sud.state.machine.freundin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BockigkeitTest {

    private FreundinStatus status;

    @BeforeEach
    void setUp() {
        status = new Bockigkeit();
    }

    @Test
    @DisplayName("kuessen: Der Status sollte sich ändern.")
    void testKuessen() {
        assertTrue(status.kuessen() instanceof Neutral);
    }

    @Test
    @DisplayName("veraergern: Es sollte ein Fehler auftreten.")
    void testVeraergern() {
        assertThrows(UnsupportedOperationException.class, () -> status.veraergern());
    }

}
