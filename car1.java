package week1.day2.assignments;

public class car1 {

	public static void main(String[] args) {
		
		car1 c1= new car1();
		c1.applyBreak();
		int applyGear = c1.applyGear();
		System.out.println(applyGear);
		int applyAcclerate = c1.applyAcclerate();
		System.out.println(applyAcclerate);
		boolean switchOnAc = c1.switchOnAc();
		System.out.println(switchOnAc);
	}	
		public void applyBreak() {
			System.out.println("Stop the car");
			
		}
		private int applyGear()
		{
			int numberofgears=4;
			return(numberofgears);
		}	
		public boolean switchOnAc() {
			return false;
			
			
		}
		
		public int applyAcclerate(){
			int accelerate=20;
			return(accelerate);
		}
			
			
		// TODO Auto-generated method stub

	}


