/*
 * 1660: Aditya Zantye
 * Software Engineering
 * End Sem practicals
 * Batch 2
 * Date: 23/04/2018
 * Refactorings applied:- Rename
 * Extracting Class
 * Extracting method*/
public class Candidate {
	
	CandidateData data = new CandidateData();

	public String getCand_name() {
		return data.cand_name;
	}
	public void setCand_name(String cand_name) {
		this.data.cand_name = cand_name;
	}
	public String getCand_constituency() {
		return data.cand_constituency;
	}
	public void setCand_constituency(String cand_constituency) {
		this.data.cand_constituency = cand_constituency;
	}
	public String getCand_id() {
		return data.cand_id;
	}
	public void setCand_id(String cand_id) {
		this.data.cand_id = cand_id;
	}
	
	public Candidate(String cand_name, String cand_constituency, String cand_id,int votes) {
		super();
		this.data.cand_name = cand_name;
		this.data.cand_constituency = cand_constituency;
		this.data.cand_id = cand_id;
		this.data.votes = votes;
	}
	

	
}
