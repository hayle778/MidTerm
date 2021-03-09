package week4;
import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		getInStartingPosition();
		for (int i = 0; i < 4; i++) {
			putBeepers();
			startNextRow();
		}
		backToStart();
	}
	
	private void getInStartingPosition() {
		turnLeft();
		move();
		turnRight();
	}
	
	private void putBeepers() {
		while (frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}
		}
	}	
		
	private void startNextRow() {	
		pickBeeper();
		turnAround();
		move();
		turnRight();
	}
	
	private void backToStart() {
		turnAround();
		move();
		turnAround();
	}
	}
