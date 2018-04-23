/*
 * 1660: Aditya Zantye
 * Software Engineering
 * End Sem practicals
 * Batch 2
 * Date: 23/04/2018
 * Refactorings applied:- Rename
 * Extracting Class
 * Extracting method*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Cast_vote {
	
	ArrayList<Vclass>_candidates = new ArrayList<Vclass>();
	String vote_id;
	 int vote1;
	 int vote2;

  	public Cast_vote (String id)
	{
		 vote_id = id;
	};

	 public void addVote(Vclass arg) {
	     _candidates.add(arg);
	     
	   }
	
	 public String getVoteID ()
	 {
		 return vote_id;
	 };
	 
	 
	 
	 public String vote_result()
	 {
	
		// double totalAmount = 0;
		// double gst = 0.08;
		// double gst_amt;
		// double fin_amt;
		 Enumeration<Vclass> candidates = Collections.enumeration(_candidates);
		 String result = "Final Voting Statistics \n" ;
		
		 result = casting_vote(candidates, result);

		 
		 System.out.println("===================================");
		 System.out.println("Candidate 1:"+ vote1);
		 System.out.println("Candidate 2:" + vote2);
		 return result;
		 
		 
		 
	 }

	/**
	 * @param candidates
	 * @param result
	 * @return
	 */
	private String casting_vote(Enumeration<Vclass> candidates, String result) {
		while(candidates.hasMoreElements())
		 {
			// double thisAmount = 0;
			 Vclass each = (Vclass) candidates.nextElement();
			 /*
			 thisAmount = each.getPizza().getPizza_amt() * each.getPizza().getQuantity();*/
			 
			 //result += "\t" + each.getCandidate().getCand_name() + "\t" + each.getCandidate().getCand_constituency() +"\n";
			 // totalAmount += thisAmount;	 
			  
			 
			 if(each.getCandidate().getCand_id() == "100")
			 {
				each.getCandidate().data.votes++;
				vote1 = each.getCandidate().data.votes;
				
			 }
			 else if(each.getCandidate().getCand_id() == "101")
			 {

				 each.getCandidate().data.votes++;
				 vote2 = each.getCandidate().data.votes;
				
			 }
			 
			result += "\t" + each.getCandidate().getCand_name() + "\t" + each.getCandidate().getCand_constituency() + "\t" + each.getCandidate().data.votes + "\n";

			 
			
		 }
		return result;
	}
	  
}



