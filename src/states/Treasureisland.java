package states;

import main.*;

public class Treasureisland implements State{
    private String stateName;

    public Treasureisland(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public State transition(Action action) {
        switch (action) {
            default: return this;
        }
    }

    @Override
    public String str() {
        return stateName;
    }

    @Override
    public String info() {
        return "Spiel Gewonnen";
    }
}
