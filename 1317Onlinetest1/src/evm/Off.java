package evm;

public class Off extends State{
	Off(){
		StateName = "off";
	}
	
	@Override
	public void Switch() {
		On on = new On();
		on.setState(on);
	}
}
