package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor d) {
	doctors.add(d);
	
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}
	
}
