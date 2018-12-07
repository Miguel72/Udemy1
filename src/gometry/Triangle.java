package gometry;

public class Triangle {
	private double a;
	private double b;
	private double c;

	public void setA(double a) {
		this.a = a;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double area(){
		double p = (a + b + c) / 2.0;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
