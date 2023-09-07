package entities;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	public double Area() {
		return Width * Height;
	}
	public double Perimeter() {
		return 2.0*(Width + Height);
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(Width,2.0) + Math.pow(Height,2.0));
	}
	public String toString() {
		return "AREA = "
			+String.format("%.2f%n", Area())
			+"PERIMETER = "
			+String.format("%.2f%n", Perimeter())
			+"DIAGONAL = "
			+String.format("%.2f%n", Diagonal());
				
				
	}
}


