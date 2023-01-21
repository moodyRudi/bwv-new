package bwv.itf.sud.state.machine.tuer;

public final class TuerOffenAbgeschlossen extends TuerStatus {
	
	private static final TuerStatus instance = new TuerOffenAbgeschlossen();
	
	private TuerOffenAbgeschlossen() {}
	
	public static TuerStatus getInstance() {
		return instance;
	}
	
	@Override
	public TuerStatus aufschliessen() {
		return TuerOffenAufgeschlossen.getInstance();
	}

}
