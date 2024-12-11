package states;

import main.Action;

public class Shipwreckbay implements State{
    static String stateName;

    public Shipwreckbay(String stateName) {
        Shipwreckbay.stateName = stateName;
    }

    @Override
    public State transition(Action action) {
        switch (action) {
            case A: return new Muskethill("Musket Hill");
            case B: return new Deadmansisland("Dead Mans Island");
            default: return this;
        }
    }

    @Override
    public String str() {
        return stateName;
    }

    @Override
    public String info() {
        return "Option A: Musket Hill\nOption B: Dead Mans Island";
    }
}
