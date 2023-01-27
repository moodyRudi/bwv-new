package bwv.itf.sud.state.machine.freundin;

public interface FreundinStatus {

    default FreundinStatus veraergern() {
        throw new UnsupportedOperationException();
    }

    default FreundinStatus kuessen() {
        throw new UnsupportedOperationException();
    }

}
