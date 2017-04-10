package interview.arrowhead;

import java.util.Objects;

public class GradePointAverage {
	
	private Float scale;
	
	private Float score;
	
	public Float getScale() {
		return scale;
	}
	
	public void setScale(Float scale) {
		this.scale = scale;
	}
	
	public Float getScore() {
		return score;
	}
	
	public void setScore(Float score) {
		this.score = score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(scale, score);
	}
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof GradePointAverage)) {
			return false;
		}
	
		GradePointAverage gpa = (GradePointAverage) o;
		return scale == gpa.scale && score == gpa.score;
	}
	
	@Override
	public String toString() {
		return "GradePointAverage [scale=" + scale + ", score=" + score + "]";
	}
}