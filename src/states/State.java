package states;

import main.*;

public interface State {
    public State transition(Action action);

    public String str();

    public String info();
}
