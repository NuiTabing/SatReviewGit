package nuiPractice;

public class Hospital {
	
	Doctor doctors[];
	Nurse nurses[];
	Patient patients[];
	int patientCounter;
	
	Hospital(int numDoctors, int numNurses, int maxPatients) {
		doctors = new Doctor[numDoctors];
		nurses = new Nurse[numNurses];
		patients = new Patient[maxPatients];
		patientCounter = 0;
	}
	
	public void addPatient(String firstName, String lastName) {
		Patient patient = new Patient(firstName, lastName);
		patients[patientCounter] = patient;
		patientCounter++;
	}
	
	public void addAge(int index, int age) {
		Patient thisPatient;
		int newAge = 0;
		thisPatient = patients[index];
		
		if(thisPatient.firstName == "Jon")
			newAge = age - 10;
			thisPatient.setAge(newAge);
	}
	
	public void hasCancerAndDie(int index) {
		Patient thisPatient;
		thisPatient = patients[index];
		
		if(thisPatient.firstName != "Jon") 
			thisPatient.gotCancerAndDie();
	}
	
	public void kidHasBorn(int index, String name) {
		Patient thisPatient;
		int currentAge;
		
		thisPatient = patients[index];
		thisPatient.justHadKid(name);
		currentAge = thisPatient.getAge();
		thisPatient.setAge(currentAge+10);
		
	}
}
