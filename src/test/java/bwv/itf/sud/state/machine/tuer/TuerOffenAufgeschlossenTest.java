package bwv.itf.sud.state.machine.tuer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TuerOffenAufgeschlossenTest {
	
	private static TuerStatus tuerStatus;

	@BeforeAll
	static void setUpBeforeClass() {
		tuerStatus = TuerOffenAufgeschlossen.getInstance();
	}

	@Test
	@DisplayName("oeffnen: Es sollte ein Fehler auftreten.")
	void testOeffnen1() {
		assertThrows(UnsupportedOperationException.class, () -> tuerStatus.oeffnen());
	}

	@Test
	@DisplayName("schliessen: Es sollte ein neuer Status zurückgegeben werden.")
	void testSchliessen1() {
		assertTrue(tuerStatus.schliessen() instanceof TuerZuAufgeschlossen);
	}

	@Test
	@DisplayName("aufschliessen: Es sollte ein Fehler auftreten.")
	void testAufschliessen1() {
		assertThrows(UnsupportedOperationException.class, () -> tuerStatus.aufschliessen());
	}

	@Test
	@DisplayName("abschliessen: Es sollte ein neuer Status zurückgegeben werden.")
	void testAbschliessen1() {
		assertTrue(tuerStatus.abschliessen() instanceof TuerOffenAbgeschlossen);
	}

}
