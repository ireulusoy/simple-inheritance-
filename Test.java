package inheritanceTrial;

public class Test {

	public static void main(String[] args) {
		
		Student s1=new Student("İrem", "1903402", "software eng", "female", 21, true, 9, 3.75,Quarter.Two);
		Profs p1=new Profs("Duygu", "123456", "computer science", "female", 35, false, 10);
		
		System.out.println(s1);
		System.out.println(p1);
		
		s1.calculate(Quarter.Two);
		
	}

}
