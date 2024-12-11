package main;

public enum Action {
    A('A'),
    B('B');

    private char value;

    Action(char value) {
        this.value = value;
    }

    public char str() {
        return this.value;
    }
}
