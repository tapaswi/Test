package evm;

import static org.junit.Assert.*;

import org.junit.Test;

public class BallotingUnitTest {
	BallotingUnit BU = new BallotingUnit();
	ControlUnit CU = new ControlUnit();
	@Test
	public void testPrepareEVM() {
		assertEquals(true, BU.prepareEVM(CU));
	}

	
}
