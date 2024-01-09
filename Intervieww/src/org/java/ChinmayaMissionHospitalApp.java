package org.java;

public class ChinmayaMissionHospitalApp {
	public static void main(String[] args) {
        // Creating a hospital
        Hospital chinmayaHospital = new Hospital("Chinmaya Mission Hospital");

        // Adding patients
        chinmayaHospital.admitPatient(new Patient("John Doe", "Bangalore"));
        chinmayaHospital.admitPatient(new Patient("Jane Doe", "Mysore"));
        chinmayaHospital.admitPatient(new Patient("Alice", "Bangalore"));
        chinmayaHospital.admitPatient(new Patient("Bob", "Hubli"));
        chinmayaHospital.admitPatient(new Patient("Charlie", "Bangalore"));

        // Analyzing patients
        double localPatientsPercentage = chinmayaHospital.calculateLocalPatientsPercentage();
        double outstationPatientsPercentage = chinmayaHospital.calculateOutstationPatientsPercentage();

        // Displaying results
        System.out.printf("Percentage of local patients: %.2f%%\n", localPatientsPercentage);
        System.out.printf("Percentage of outstation patients: %.2f%%\n", outstationPatientsPercentage);
    }
}
