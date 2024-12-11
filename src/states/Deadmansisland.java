package states;

import main.*;

public class Deadmansisland implements State{
    private String stateName;

    public Deadmansisland(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public State transition(Action action) {
        switch (action) {
            case A: return new Muskethill("Musket Hill");
            case B: return new Shipwreckbay("Shipwreck Bay");
            default: return this;
        }
    }

    @Override
    public String str() {
        return stateName;
    }

    @Override
    public String info() {
        return "Option A: Musket Hill \nOption B: Shipwreck Bay";
    }
    
}
