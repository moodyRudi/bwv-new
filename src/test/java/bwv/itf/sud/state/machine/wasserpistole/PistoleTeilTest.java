package bwv.itf.sud.state.machine.wasserpistole;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PistoleTeilTest {

    private static final int NEGATIV = -100;
    private static final int LEER = 0;
    private static final int GELEERT = 200;
    private static final int TEILGEFUELLT = 250;
    private static final int AUFGEFUELLT = 450;
    private static final int GEFUELLT = 500;
    private static final int UEBERFUELLT = 700;


    private PistoleStatus status;

    @BeforeEach
    void setUp() {
        status = new PistoleTeil(TEILGEFUELLT);
    }

    @Test
    @DisplayName("Konstruktor: Erzeugt richtiges Objekt")
    void testKonstruktor() {
        assertEquals(TEILGEFUELLT, status.getFuellMenge());
    }

    @Test
    @DisplayName("schiessen: Leert den Tank")
    void testSchiessen1() {
        status = status.schiessen();

        assertEquals(GELEERT, status.getFuellMenge());
    }

    @Test
    @DisplayName("schiessen: Schießt den Tank leer")
    void testSchiessen2() {
        status = status.schiessen();
        status = status.schiessen();
        status = status.schiessen();
        status = status.schiessen();
        status = status.schiessen();

        assertTrue(status instanceof PistoleLeer);
    }

    @Test
    @DisplayName("fuellen: Teilfüllung")
    void testFuellen1() {
        status = status.fuellen(GELEERT);

        assertEquals(AUFGEFUELLT, status.getFuellMenge());
    }

    @Test
    @DisplayName("fuellen: Füllt komplett")
    void testFuellen2() {
        status = status.fuellen(TEILGEFUELLT);

        assertTrue(status instanceof PistoleVoll);
        assertEquals(GEFUELLT, status.getFuellMenge());
    }

    @Test
    @DisplayName("fuellen: Füllt zu viel")
    void testFuellen3() {
        status = status.fuellen(GEFUELLT);

        assertTrue(status instanceof PistoleVoll);
        assertEquals(GEFUELLT, status.getFuellMenge());
    }

    @Test
    @DisplayName("fuellen: Füllt negative Menge")
    void testFuellen4() {
        assertThrows(IllegalArgumentException.class, () -> status.fuellen(NEGATIV));
    }

}
