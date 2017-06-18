package arrowhead;

import java.util.Objects;

public class Decision {

	private String result;
	
	private String message;
	
	public String getResult() {
		return result;
	}
	
	public void setResult(final String result) {
		this.result = result;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(final String message) {
		this.message = message;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(result, message);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (o == this) {
			return true;
		}
		
		if (!(o instanceof Decision)) { 
			return false;
		}
		
		Decision decision = (Decision) o;
		return 
			Objects.equals(result, decision.result) && 
			Objects.equals(message, decision.message);
	}
	
	@Override
	public String toString() {
		return "Decision [result=" + result + ", message=" + message + "]";
	}
}