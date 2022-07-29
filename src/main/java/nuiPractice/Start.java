package nuiPractice;

public class Start {
	static public void main(String[] args) {
		
		House pJonHouse;
		House nickHouse;
		
		pJonHouse = new House(10,5);
		nickHouse = new House(5,2);
		
//		pJonHouse = null; 
		
		if(pJonHouse == null) System.out.println("pJonHouse is null");
		else System.out.println("not null");
		
		pJonHouse.isOnFire();
	}
}
