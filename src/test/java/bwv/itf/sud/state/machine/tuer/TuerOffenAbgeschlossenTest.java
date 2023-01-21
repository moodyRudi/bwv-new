package bwv.itf.sud.state.machine.tuer;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TuerOffenAbgeschlossenTest {
	
	private static TuerStatus tuerStatus;
	
	@BeforeAll
	static void setUpBeforeClass() {
		tuerStatus = TuerOffenAbgeschlossen.getInstance();
	}

	@Test
	@DisplayName("oeffnen: Es sollte ein Fehler auftreten.")
	void testOeffnen1() {
		assertThrows(UnsupportedOperationException.class, () -> tuerStatus.oeffnen());
	}

	@Test
	@DisplayName("schliessen: Es sollte ein Fehler auftreten.")
	void testSchliessen1() {
		assertThrows(UnsupportedOperationException.class, () -> tuerStatus.schliessen());
	}

	@Test
	@DisplayName("aufschliessen: Es sollte ein neuer Status zurückgegeben werden.")
	void testAufschliessen1() {
		assertTrue(tuerStatus.aufschliessen() instanceof TuerOffenAufgeschlossen);
	}

	@Test
	@DisplayName("abschliessen: Es sollte ein Fehler auftreten")
	void testAbschliessen1() {
		assertThrows(UnsupportedOperationException.class, () -> tuerStatus.abschliessen());
	}

}
