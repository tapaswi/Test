package evm;

public abstract class State {
	String StateName;
	public abstract void Switch();
	
	public String getStateName(){
		return StateName;
	}

}
