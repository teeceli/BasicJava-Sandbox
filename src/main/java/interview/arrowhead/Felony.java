package interview.arrowhead;

import java.util.Objects;

public class Felony {
	
	private Boolean hasFelony;
	
	private Integer yearsSinceFelony;
	
	public Boolean getHasFelony() {
		return hasFelony;
	}
	
	public void setHasFelony(Boolean hasFelony) {
		this.hasFelony = hasFelony;
	}
	
	public Integer getYearsSinceFelony() {
		return yearsSinceFelony;
	}
	
	public void setYearsSinceFelony(Integer yearsSinceFelony) {
		this.yearsSinceFelony = yearsSinceFelony;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hasFelony, yearsSinceFelony);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (o == this)
			return true;
		if (!(o instanceof Felony)) { 
			return false;
		}
			
		Felony felony = (Felony) o;
		return hasFelony == felony.hasFelony && yearsSinceFelony == felony.yearsSinceFelony;
	}
	
	@Override
	public String toString() {
		return "Felony [hasFelony=" + hasFelony + ", yearsSinceFelony=" + yearsSinceFelony + "]";
	}
}