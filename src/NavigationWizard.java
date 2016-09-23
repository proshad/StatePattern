/**
 * Created by proshad on 9/15/16.
 * A simple navigation wizard of 3 states.
 * I don’t want to allow navigation from 1st state to 3rd and from 3rd to 1st state. Only the second state should allow both a previous and next states
 */
public class NavigationWizard {
    private State initialState;
    private State middleState;
    private State finalState;

    private State current;


    public NavigationWizard() {
        initialState = new InitialState(this);
        middleState = new MiddleState(this);
        finalState = new FinalState(this);

        // lets assume that the first state of the wizzard will be InitialState
        current = initialState;
    }

    public void setState(State state) {
        this.current = state;
    }

    public void performNext() {
        current.next();
    }

    public void performPrevious() {
        current.previous();
    }

    public State getInitialState(){
        return initialState;
    }

    public State getMiddleState(){
        return middleState;
    }

    public State getFinalState(){
        return finalState;
    }
}
