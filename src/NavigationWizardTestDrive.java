/**
 * Created by proshad on 9/15/16.
 */
public class NavigationWizardTestDrive {
    public static void main(String[] args){
        NavigationWizard navigationWizard = new NavigationWizard();

        navigationWizard.performNext();
        navigationWizard.performNext();
        navigationWizard.performNext();

        navigationWizard.performPrevious();
        navigationWizard.performPrevious();
        navigationWizard.performPrevious();

        navigationWizard.performNext();
        navigationWizard.performPrevious();
    }
}
