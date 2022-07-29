package nuiPractice;

public class House {
	
	int numDoors;
	int numBedRooms;
	int numBathRooms;
	int squareFootage;
	
	House(int numDoors, int numBedRooms) {
		this.numDoors = numDoors;
		this.numBedRooms = numBedRooms;
		this.numBathRooms = 1;
	}
	
	public void isOnFire() {
		System.out.println("im on fire");
	}
	
}
