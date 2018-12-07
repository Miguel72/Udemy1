package company;

public class Employe {
	private String name;
	private double saleryGross;
	private double tax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaleryGross() {
		return saleryGross;
	}

	public void setSaleryGross(double saleryGross) {
		this.saleryGross = saleryGross;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	
	public double getNet(){
		return saleryGross - tax;
	}
	
	public void Raise(double percentage){
		saleryGross *= (100.0 + percentage);
	}
	
	public String toString(){
		return "Name is " + name
			+ "/nnetIs is " + String.format("%.2f", getNet());
	}
}
