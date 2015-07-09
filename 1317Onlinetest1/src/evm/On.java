package evm;

public class On extends State{
	On(){
		StateName = "off";
	}

	@Override
	public void Switch() {
		On on = new On();
		on.setState(on);
	}
}
