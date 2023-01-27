package bwv.itf.sud.state.machine.wasserpistole;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PistoleLeerTest {

    private static final int NEGATIV = -100;
    private static final int LEER = 0;
    private static final int TEILGEFUELLT = 200;
    private static final int GEFUELLT = 500;
    private static final int UEBERFUELLT = 700;

    private PistoleStatus status;

    @BeforeEach
    void setUp() {
        status = new PistoleLeer();
    }

    @Test
    @DisplayName("Konstruktor: Erzeugt richtigen Status")
    void testKonstruktor() {
        assertEquals(LEER, status.getFuellMenge());
    }

    @Test
    @DisplayName("schiessen: Schlägt fehl")
    void testSchiessen() {
        assertThrows(UnsupportedOperationException.class, () -> status.schiessen());
    }

    @Test
    @DisplayName("fuellen: Ändert zu teilgefüllt")
    void testFuellen1() {
        PistoleStatus neuerStatus = status.fuellen(TEILGEFUELLT);

        assertTrue(neuerStatus instanceof PistoleTeil);
    }

    @Test
    @DisplayName("fuellen: Ändert zu gefüllt")
    void testFuellen2() {
        PistoleStatus neuerStatus = status.fuellen(GEFUELLT);

        assertTrue(neuerStatus instanceof PistoleVoll);
    }

    @Test
    @DisplayName("fuellen: Füllt zu viel")
    void testFuellen3() {
        PistoleStatus neuerStatus = status.fuellen(UEBERFUELLT);

        assertTrue(neuerStatus instanceof PistoleVoll);
    }

    @Test
    @DisplayName("fuellen: Füllt negative Menge")
    void testFuellen4() {
        assertThrows(IllegalArgumentException.class, () -> status.fuellen(NEGATIV));
    }

}
