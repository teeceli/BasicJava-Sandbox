package com.sandbox.arrowhead;

import java.util.Objects;

public class TestScores {

	private Integer satScore;
	
	private Integer actScore;
	
	public Integer getSatScore() {
		return satScore;
	}
	
	public void setSatScore(Integer satScore) {
		this.satScore = satScore;
	}
	
	public Integer getActScore() {
		return actScore;
	}
	
	public void setActScore(Integer actScore) {
		this.actScore = actScore;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(satScore, actScore);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TestScores)) {
			return false;
		}
			
		TestScores testScores = (TestScores) o;
		return satScore == testScores.satScore && 
				actScore == testScores.actScore;
	}
	
	@Override
	public String toString() {
		return "TestScores [satScore=" + satScore + ", actScore=" + actScore + "]";
	}
}