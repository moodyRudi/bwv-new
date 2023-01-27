package bwv.itf.sud.state.machine.tuer;

public final class TuerZuAbgeschlossen implements TuerStatus {
	
	private static final TuerStatus instance = new TuerZuAbgeschlossen();
	
	private TuerZuAbgeschlossen() {}
	
	public static TuerStatus getInstance() {
		return instance;
	}
	
	@Override
	public TuerStatus aufschliessen() {
		return TuerZuAufgeschlossen.getInstance();
	}

}
