package states;

import main.*;

public class Smugglerscove implements State{
    private String stateName;

    public Smugglerscove(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public State transition(Action action) {
        switch (action) {
            case A: return new Piratesisland("Pirates Island");
            case B: return new Treasureisland("Treasure Island");
            default: return this;
        }
    }

    @Override
    public String str() {
        return stateName;
    }

    @Override
    public String info() {
        return "Option A: Pirates Island\nOption B: Treasure Island";
    }
}
