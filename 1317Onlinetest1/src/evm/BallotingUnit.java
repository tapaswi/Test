package evm;

public class BallotingUnit {
	CandidateLamp candidateLamp = new CandidateLamp();
	
	ReadyLamp readyLamp = new ReadyLamp();
	Slot slot[][] = new Slot[2][5];
	
	public void markSlots(int numberOfSlots){
		for(int i=0;i<numberOfSlots;i++){
			slot[i][0].setName("voter"+i);
			slot[i][1].setReadyLamp();
			slot[i][2].setCandidateButton();
		}
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
	
}
