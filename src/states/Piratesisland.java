package states;

import main.*;

public class Piratesisland implements State{
    private String stateName;

    public Piratesisland(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public State transition(Action action) {
        switch (action) {
            case A: return new Shipwreckbay("Shipwreck Bay");
            case B: return new Muskethill("Musket Hill");
            default: return this;
        }
    }

    @Override
    public String str() {
        return stateName;
    }

    @Override
    public String info() {
        return "Option A: Shipwreck Bay \nOption B: Musket Hill";
    }
}
