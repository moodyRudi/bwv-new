package bwv.itf.sud.state.machine.tuer;

public final class TuerZuAufgeschlossen extends TuerStatus {
	
	private static final TuerStatus instance = new TuerZuAufgeschlossen();
	
	private TuerZuAufgeschlossen() {}
	
	public static TuerStatus getInstance() {
		return instance;
	}
	
	@Override
	public TuerStatus oeffnen() {
		return TuerOffenAufgeschlossen.getInstance();
	}
	
	@Override
	public TuerStatus abschliessen() {
		return TuerZuAbgeschlossen.getInstance();
	}

}
