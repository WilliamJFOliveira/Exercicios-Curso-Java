package entities;

public class Notes {
	public String name;
	public double noteT1;
	public double noteT2;
	public double noteT3;

	
	public double finalGrade() {
		return noteT1 + noteT2 + noteT3;
	}
	public double missingPoints() {
		 if(finalGrade() < 60.0) {
			 return 60.0 - finalGrade();
		 }
		 else {
			 return 0.0;
		 }
	}
}
