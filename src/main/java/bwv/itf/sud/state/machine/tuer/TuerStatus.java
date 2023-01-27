package bwv.itf.sud.state.machine.tuer;

public interface TuerStatus {
	
	default TuerStatus oeffnen() {
		throw new UnsupportedOperationException();
	}
	
	default TuerStatus schliessen() {
		throw new UnsupportedOperationException();
	}
	
	default TuerStatus abschliessen() {
		throw new UnsupportedOperationException();
	}
	
	default TuerStatus aufschliessen() {
		throw new UnsupportedOperationException();
	}

}
