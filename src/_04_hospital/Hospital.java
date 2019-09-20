package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<String> doctors = new ArrayList<String>();
		
	
	ArrayList<String> patients = new ArrayList<String>();
	
	public void addDoctor(Doctor d) {
	doctors.add("" + d);
	
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add("" + patient);
	}

	public List<Doctor> getPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}
	
}
