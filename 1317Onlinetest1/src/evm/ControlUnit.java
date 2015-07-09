package evm;

public class ControlUnit {
	DisplaySection displaySection = new DisplaySection();
	//BallotSection ballotSection = new BallotSection();
	CloseButton close = new CloseButton();
	Boolean pullStart;
	
	int totalVotes;
	
	public Boolean increamentVotes(){
		this.totalVotes++;
		return true;
	}
	
	public int getVotes(){
		return totalVotes;
	}
	
	public void clear(){
		BallotingUnit BU = new BallotingUnit();
	}
	
	public Boolean startPull(){
		return pullStart=true;
	}

	public Boolean closePull(){
		return pullStart=false;
	}
	
	public void Close(){
		if(close.pressed()==true){
			
		}
	}
}
