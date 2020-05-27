public class DoorLock {

    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock( Combination combination ) {
        numberOfAttempts= 0;
		this.combination = combination;
		open = false;
		activated = true;
    }

    // Access methods.

    public boolean isOpen() {
		return open;
    }

    public boolean isActivated() {;
		return activated;
    }

    // Notice that numberOfAttempts is compared to
    // MAX_NUMBER_OF_ATTEMPTS only when its value has been
    // incremented, Also, numberOfAttempts should be set to zero when
    // activated is false.  Problems related to the combined action of
    // these two variables have caused problems for some students.

    public boolean open( Combination combination ) {
		if (activated == true){
			if (combination.equals(combination) == true){
				numberOfAttempts = 0;
				return true;
			}
			else{
				numberOfAttempts++;
				if (numberOfAttempts == MAX_NUMBER_OF_ATTEMPTS);
				return false;
			}

        }
        return true;
    }

    public void activate( Combination c ) {
        if (combination.equals(c) != true){
			activated = false;
		}
		else {
			activated = true;
		}
    }

}
