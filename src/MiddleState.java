/**
 * Created by proshad on 9/15/16.
 */
public class MiddleState implements State {
    NavigationWizard navigationWizard;

    public MiddleState(NavigationWizard navigationWizard) {
        this.navigationWizard = navigationWizard;
    }

    @Override
    public void next() {
        navigationWizard.setState(navigationWizard.getFinalState());
        System.out.println("Middle state to final state transition");
    }

    @Override
    public void previous() {
        navigationWizard.setState(navigationWizard.getInitialState());
        System.out.println("Middle state to initial state transition");
    }
}
