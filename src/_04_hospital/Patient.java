package _04_hospital;

public class Patient {
boolean pulse;

Doctor doc = new Doctor();

	public void checkPulse() {
		// TODO Auto-generated method stub
		feelsCaredFor();
		pulse = true;
		
	}
	
	public Object feelsCaredFor() {
		// TODO Auto-generated method stub
		
		if(pulse == true) {
			return true;
		}
		else{
			return false;
		}
	}
}
