package evm;

public class ReadyLamp extends State implements Lamp {

	ReadyLamp(){
		StateName = "off";
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Switch() {
		Off off = new Off();
		off.setState(off);
	}


	

}
