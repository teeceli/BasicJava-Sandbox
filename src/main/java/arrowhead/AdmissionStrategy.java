package arrowhead;

public interface AdmissionStrategy {
	
	public void setCandidate(Candidate candidate);

	public Decision checkAccepted();
}