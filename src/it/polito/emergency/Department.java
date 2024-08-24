package it.polito.emergency;

public class Department {

    private String name;
    private int maxPatients;
    //lista pazienti 

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

    


}
