package bwv.itf.sud.state.machine.wasserpistole;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WasserpistoleTest {

    private static final int TANKVOLUMEN = 500;

    private Wasserpistole pistole;

    @BeforeEach
    void setUp() {
        pistole = new Wasserpistole();
    }

    @Test
    @DisplayName("Konstruktor: Pistole ist am Anfang leer")
    void testKonstruktor1() {
        assertTrue(pistole.istLeer());
    }

    @Test
    @DisplayName("fuellen: Pistole wird aufgefüllt")
    void testFuellen1() {
        pistole.fuellen(TANKVOLUMEN);

        assertTrue(pistole.istVoll());
    }

    @Test
    @DisplayName("schiessen: Pistole wird abgeschossen")
    void testSchiessen1() {
        pistole.fuellen(TANKVOLUMEN);
        pistole.schiessen();

        assertFalse(pistole.istVoll());
        assertFalse(pistole.istLeer());
    }



}
