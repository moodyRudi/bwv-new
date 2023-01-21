package bwv.itf.sud.state.machine.tuer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TuerTest {

	private Tuer tuer;

	@BeforeEach
	void setUp() throws Exception {
		tuer = new Tuer();
	}

	@Test
	@DisplayName("Konstruktor: Anfangsstatus sollte 'Zu' und 'Abgeschlossen' sein")
	void testKonstruktor1() {
		assertTrue(tuer.getTuerStatus() instanceof TuerZuAbgeschlossen);
	}
	
	@Test
	@DisplayName("aufschliessen: Die Tür sollte aufgeschlossen werden")
	void testAufschliessen1() {
		tuer.aufschliessen();
		assertTrue(tuer.getTuerStatus() instanceof TuerZuAufgeschlossen);
	}
	
	@Test
	@DisplayName("oeffnen: Die Tür sollte geöffnet werden")
	void testOeffnen() {
		tuer.aufschliessen();
		tuer.oeffnen();
		assertTrue(tuer.getTuerStatus() instanceof TuerOffenAufgeschlossen);
	}
	
	@Test
	@DisplayName("schliessen: Die Tür sollte geschlossen werden")
	void testSchliessen() {
		tuer.aufschliessen();
		tuer.oeffnen();
		tuer.schliessen();
		assertTrue(tuer.getTuerStatus() instanceof TuerZuAufgeschlossen);
	}
	
	@Test
	@DisplayName("abschliessen: Die Tür sollte verschlossen werden")
	void testAbschliessen() {
		tuer.aufschliessen();
		tuer.oeffnen();
		tuer.abschliessen();
		assertTrue(tuer.getTuerStatus() instanceof TuerOffenAbgeschlossen);
	}
	
}
