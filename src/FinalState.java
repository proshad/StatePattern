/**
 * Created by proshad on 9/15/16.
 */
public class FinalState implements State {
    NavigationWizard navigationWizard;

    public FinalState(NavigationWizard navigationWizard) {
        this.navigationWizard = navigationWizard;
    }

    @Override
    public void next() {
        System.out.println("Sorry!!! This is final state. You cannot go to next state from here.");
    }

    @Override
    public void previous() {
        navigationWizard.setState(navigationWizard.getMiddleState());
        System.out.println("Final state to middle state transition");
    }
}
