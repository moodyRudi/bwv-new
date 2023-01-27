package bwv.itf.sud.state.machine.wasserpistole;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PistoleVollTest {

    private static final int GEFUELLT = 500;
    private static final int NACH_EINEM_SCHUSS = 400;

    private PistoleStatus status;

    @BeforeEach
    void setUp() {
        status = new PistoleVoll();
    }

    @Test
    @DisplayName("Konstruktor: Erzeugt richtigen Status")
    void testKonstruktor1() {
        assertEquals(GEFUELLT, status.getFuellMenge());
    }

    @Test
    @DisplayName("fuellen: Schlägt fehl")
    void testFuellen1() {
        assertThrows(UnsupportedOperationException.class, () -> status.fuellen(GEFUELLT));
    }

    @Test
    @DisplayName("schiessen: Ändert Status")
    void testSchiessen1() {
        PistoleStatus neuerStatus = status.schiessen();

        assertTrue(neuerStatus instanceof PistoleTeil);
        assertEquals(NACH_EINEM_SCHUSS, neuerStatus.getFuellMenge());
    }

}
