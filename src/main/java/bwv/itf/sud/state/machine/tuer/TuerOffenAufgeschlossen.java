package bwv.itf.sud.state.machine.tuer;

public final class TuerOffenAufgeschlossen implements TuerStatus {
	
	private static final TuerStatus instance = new TuerOffenAufgeschlossen();
	
	private TuerOffenAufgeschlossen() {}
	
	public static TuerStatus getInstance() {
		return instance;
	}
	
	@Override
	public TuerStatus schliessen() {
		return TuerZuAufgeschlossen.getInstance();
	}
	
	@Override
	public TuerStatus abschliessen() {
		return TuerOffenAbgeschlossen.getInstance();
	}

}
