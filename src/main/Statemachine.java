package main;

import java.util.Scanner;

import states.*;

public class Statemachine {
    private State currentState;
    private boolean goalReached;

    public Statemachine() {
        currentState = new Piratesisland("Pirates Island");
        goalReached = false;
    }

    public void run() {
        while (!goalReached) {
            System.out.println("Current State: " + currentState.str());
            System.out.println(currentState.info());

            Action action = getUserAction();

            currentState = currentState.transition(action);

            if (currentState instanceof Treasureisland) {
                goalReached = true;
                System.out.println("---------------------------------------");
                System.out.println("Congratulations! You reached the Treasure Island!");
            }

            System.out.println("---------------------------------------");
        }
    }

    private Action getUserAction() {       
        Scanner scanner = new Scanner(System.in);
        char character = 'x';
        
        while (character != 'A' && character != 'a' && character != 'B' && character != 'b') {
            System.out.print("\nPlease choose A or B: ");

            String input = scanner.next();
            character = input.charAt(0);
        }

        if (character == 'A'|| character == 'a') {
            return Action.A;
        } else {
            return Action.B;
        }
    }

    public static void main(String[] args) {
        Statemachine stateMachine = new Statemachine();
        System.out.println("---------------------------------------");
        stateMachine.run();
    }
}
