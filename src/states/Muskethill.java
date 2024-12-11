package states;

import main.Action;

public class Muskethill implements State {
    static String stateName;

    public Muskethill(String stateName) {
        Muskethill.stateName = stateName;
    }

    @Override
    public State transition(Action action) {
        switch (action) {
            case A: return new Piratesisland("Pirates Island");
            case B: return new Mutineersisland("Mutineers Island");
            default: return this;
        }
    }

    @Override
    public String str() {
        return stateName;
    }

    @Override
    public String info() {
        return "Option A: Pirates Island \nOption B: Mutineers Island";
    }
    
}
