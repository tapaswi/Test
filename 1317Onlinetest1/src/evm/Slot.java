package evm;

public class Slot {
	String name;
	ReadyLamp readyLamp;
	CandidateButton candidateButton;
	ControlUnit controller;
	
	public void setCandidateButton(){
		candidateButton = new CandidateButton();
	}
	
	public void setReadyLamp(){
		readyLamp = new ReadyLamp();
	}
	
	public void setName(String name){
		this.name = name;
	}
}
