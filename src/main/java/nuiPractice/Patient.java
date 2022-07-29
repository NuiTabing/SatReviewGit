package nuiPractice;

public class Patient {
	
	String firstName;
	String lastName;
	int age;
	int weight;
	int height;
	int id;
	Boolean isDead;
	
	Patient kid;
	
	Patient(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		isDead = false;
	}
	
	public void setAge(int age) {
		this.age = age;
		System.out.println("im setting the age");
		System.out.println("and you suck");
		System.out.println("god you're so old");
	}
	
	public void gotCancerAndDie() {
		this.isDead = true;
		System.out.println("good");
	}
	
	public void justHadKid(String name) {
		Patient newKid = new Patient(name, this.lastName);
	}
	
	public int getAge() {
		return age;
	}
}
