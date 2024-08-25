package it.polito.emergency;

import java.util.TreeMap;

public class Department {

    private String name;
    private int maxPatients;
    private TreeMap<String , Patient> patientsHospitalized = new TreeMap<>();

    public Department(String name, int maxPatients) {
        this.name = name;
        this.maxPatients = maxPatients;
    }

    public String getName() {
        return name;
    }

    public int getMaxPatients() {
        return maxPatients;
    }

    public TreeMap<String, Patient> getPatientsHospitalized() {
        return patientsHospitalized;
    }

    public void addPatient(Patient p){
        patientsHospitalized.put(p.getFiscalCode(), p);
    }
    


}
