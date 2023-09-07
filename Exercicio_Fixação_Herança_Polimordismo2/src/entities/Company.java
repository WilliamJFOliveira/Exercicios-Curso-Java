package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	
	public Company(String name, Double anuallncome, Integer numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double Tax() {
		if(numberOfEmployees > 10) {
			return getAnuallncome() * 0.14;
		}
		else {
			return getAnuallncome() * 0.16;
		}
	}

}
