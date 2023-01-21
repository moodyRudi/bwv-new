package src.main.java.bwv.itf.sud.state.machine.tuer;

public class Tuer {
	
	private TuerStatus tuerStatus;
	
	public Tuer() {
		tuerStatus = TuerZuAbgeschlossen.getInstance();
	}
	
	public void oeffnen() {
		tuerStatus = tuerStatus.oeffnen();
	}
	
	public void schliessen() {
		tuerStatus = tuerStatus.schliessen();
	}
	
	public void abschliessen() {
		tuerStatus = tuerStatus.abschliessen();
	}
	
	public void aufschliessen() {
		tuerStatus = tuerStatus.aufschliessen();
	}
	
	public TuerStatus getTuerStatus() {
		return tuerStatus;
	}

}
