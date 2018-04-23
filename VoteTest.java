/*
 * 1660: Aditya Zantye
 * Software Engineering
 * End Sem practicals
 * Batch 2
 * Date: 23/04/2018
 * Refactorings applied:- Rename
 * Extracting Class
 * Extracting method*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoteTest {

	Candidate candidate1,candidate2;
	Cast_vote v1;

	@BeforeEach
	void setUp() throws Exception {
		candidate1 = new Candidate ("ABC","Mapusa","100",0);
		candidate2 = new Candidate ("XYZ","Mapusa","101",0);
		v1 = new Cast_vote("ME");
		v1.addVote(new Vclass(candidate1));
		v1.addVote(new Vclass(candidate2));
		v1.addVote(new Vclass(candidate2));
		v1.addVote(new Vclass(candidate2));
		v1.addVote(new Vclass(candidate1));
		System.out.println(v1.vote_result());

		
	}

	
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	

}
