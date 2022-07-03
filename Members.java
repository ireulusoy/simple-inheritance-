package inheritanceTrial;

public abstract class Members { //since this is an abstract class I cannot instantiate this one as:
	//Member m1=new Member(); I cannot write abstract in the beginning of the constructor 
	//but I already do not need it. Since it is enough to say this is abstract class.
	//but you should define it for methods if necessary.
	
	String name;
	String id;
	String department;
	String gender;
	private int age;
	protected boolean isPermanent;
	
	
	
	public Members() {
		
	}
	
	public Members(String name, String id, String department, String gender, int age, boolean isPermanent) {
		this.name=name;
		this.id=id;
		this.department=department;
		this.gender=gender;
		this.age=age;
		this.isPermanent=isPermanent;
		
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Members [name=" + name + ", id=" + id + ", department=" + department + ", gender=" + gender + ", age="
				+ age + ", isPermanent=" + isPermanent + "]";
	}

	
	
	
	
}
