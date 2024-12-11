package states;

import main.*;

public class Mutineersisland implements State{
    private String stateName;

    public Mutineersisland(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public State transition(Action action) {
        switch (action) {
            case B: return new Deadmansisland("Dead Mans Island");
            case A: return new Smugglerscove("Smugglers Cove");
            default: return this;
        }
    }

    @Override
    public String str() {
        return stateName;
    }

    @Override
    public String info() {
        return "Option A: Smugglers Cove\nOption B: Dead Mans Island";
    }
}
