package bwv.itf.sud.state.machine.tuer;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TuerZuAufgeschlossenTest {

	private static TuerStatus tuerStatus;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tuerStatus = TuerZuAufgeschlossen.getInstance();
	}

	@Test
	@DisplayName("oeffnen: Es sollte ein neuer Status zurückgegeben werden.")
	void testOeffnen1() {
		assertTrue(tuerStatus.oeffnen() instanceof TuerOffenAufgeschlossen);
	}

	@Test
	@DisplayName("schliessen: Es sollte ein Fehler auftreten.")
	void testSchliessen1() {
		assertThrows(UnsupportedOperationException.class, () -> tuerStatus.schliessen());
	}

	@Test
	@DisplayName("aufschliessen: Es sollte ein Fehler auftreten.")
	void testAufschliessen1() {
		assertThrows(UnsupportedOperationException.class, () -> tuerStatus.aufschliessen());
	}

	@Test
	@DisplayName("abschliessen: Es sollte ein neuer Status zurückgegeben werden.")
	void testAbschliessen1() {
		assertTrue(tuerStatus.abschliessen() instanceof TuerZuAbgeschlossen);
	}

}
