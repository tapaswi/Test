package evm;

public class BallotingUnit {
	CandidateLamp candidateLamp = new CandidateLamp();
	TotalButton total = new TotalButton();
	ReadyLamp readyLamp = new ReadyLamp();
	Slot slot[][] = new Slot[2][5];
	
	public Boolean prepareEVM(ControlUnit CU){
		if(markSlots(5)==true){
			CU.startPull();
			return true;
		}
		else return false;
	}
	
	public Boolean markSlots(int numberOfSlots){
		for(int i=0;i<numberOfSlots;i++){
			slot[i][0].setName("voter"+i);
			slot[i][1].setReadyLamp();
			slot[i][2].setCandidateButton();
		}
		return true;
	}
	
	public Boolean vote(int candidateId){
		if(slot[candidateId][2].candidateButton.pressed()==true){
			if(slot[candidateId][2].controller.increamentVotes()==true){
				return true;
			}
			else 
				return false;
		}
		else
			return false;
	}
	
	public void displayTotalVotes(ControlUnit CU){
		if(total.pressed()==true){
			CU.getTotalVotes();
		}
	}
	
}
