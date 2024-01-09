package org.java;

import java.util.ArrayList;

public class Hospital {
	String name;
	ArrayList<Patient> patients;

	public Hospital(String name) {
		this.name = name;
		this.patients = new ArrayList<>();

	}

	public void admitPatient(Patient patient) {
		patients.add(patient);
	}

	public double calculateLocalPatientsPercentage() {
		if (patients.isEmpty()) {
			return 0.0; // Avoid division by zero
		}

		int localPatients = 0;

		for (Patient patient : patients) {
			if (patient.getLocation().equalsIgnoreCase("Bangalore")) {
				localPatients++;
			}
		}

		return ((double) localPatients / patients.size()) * 100;
	}

	public double calculateOutstationPatientsPercentage() {
		return 100 - calculateLocalPatientsPercentage();
	}
}
