package inheritanceTrial;

public class Profs extends Members  {

	int numOfWorking;
	
	public Profs(String name, String id, String department, String gender, int age, boolean isPermanent,
			int numOfWorking) {
		super(name, id, department, gender, age, isPermanent);
		this.numOfWorking = numOfWorking;
	}

	@Override
	public String toString() {
		return "Profs [numOfWorking=" + numOfWorking + super.toString();
	}

	
	

	
}
