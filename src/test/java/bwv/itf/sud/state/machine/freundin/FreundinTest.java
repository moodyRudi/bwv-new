package bwv.itf.sud.state.machine.freundin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FreundinTest {

    public Freundin freundin;

    @BeforeEach
    void setUp() {
        freundin = new Freundin();
    }

    @Test
    @DisplayName("Konstruktor: Startet fröhlich")
    void testKostruktor() {
        assertTrue(freundin.getStatus() instanceof Froehlichkeit);
    }

    @Test
    @DisplayName("veraergern: Sollte den Status ändern")
    void testVeraergern() {
        freundin.veraergern();
        assertTrue(freundin.getStatus() instanceof Bockigkeit);
    }

    @Test
    @DisplayName("kuessen: Sollte den Status ändern")
    void testKuessen() {
        freundin.veraergern();
        freundin.kuessen();
        assertTrue(freundin.getStatus() instanceof Neutral);
    }

}
