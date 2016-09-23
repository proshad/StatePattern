/**
 * Created by proshad on 9/15/16.
 */
public class InitialState implements State {

    NavigationWizard navigationWizard;

    public InitialState(NavigationWizard navigationWizard) {
        this.navigationWizard = navigationWizard;
    }

    @Override
    public void next() {
        navigationWizard.setState(navigationWizard.getMiddleState());
        System.out.println("Initial state to middle state transition");
    }

    @Override
    public void previous() {
        System.out.println("Sorry!!! You cannot go to previous state from here");
    }
}
