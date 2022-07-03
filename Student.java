package inheritanceTrial;



public class Student extends Members implements Calculate {

	int numOfLecture;
	double gno;
	Quarter quarter;
	
	public Student(String name, String id, String department, String gender, int age, boolean isPermanent
			,int numofLecture, double gno, Quarter quarter) {
		
		super(name, id, department, gender, age, isPermanent);
		this.numOfLecture=numOfLecture;
		this.gno=gno;
		this.quarter=quarter;
		
		
	}
	
	int totalFee=50000;
	boolean cont=true;
	
	public void calculate (Quarter quarter) {
	
	while(cont) {
	switch (quarter) {
	case One: 
		System.out.println("your fee is: "+ (int)(totalFee-(totalFee*0.5)));
		cont=false;
		break;
	case Two: 
		System.out.println("your fee is: "+ (int)(totalFee-(totalFee*0.25)));
		cont=false;
		break;
	case Three: 
		System.out.println("your fee is: "+ (int)(totalFee-(totalFee*0.15)));
		cont=false;
		break;
	case Four: 
		System.out.println("your fee is: "+ totalFee);
		cont=false;
		break;

	
	default:
		System.out.println("invalid quarter,  enter it again");
		
		
		}
	}
	}

	@Override
	public String toString() {
		return "Student [numOfLecture=" + numOfLecture + ", gno=" + gno + ", quarter=" + quarter  + ", name=" + name + ", id=" + id + ", department=" + department
				+ ", gender=" + gender + ", isPermanent=" + isPermanent + "]";
	}
	
	
	
}

