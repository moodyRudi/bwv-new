package bwv.itf.sud.state.machine.freundin;

public class Bockigkeit implements FreundinStatus {

    @Override
    public FreundinStatus kuessen() {
        return new Neutral();
    }

}
