package it.polito.emergency;

public class Professional {

    private String id;
    private String name;
    private String surname;
    private String specialization;
    private Integer startPeriod;
    private Integer endPeriod;
    private String periodStr;

    public Professional(String id, String name, String surname, String specialization, String periodStr) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.periodStr = periodStr;

        String[] first = periodStr.split(" to ");
        String[] start = first[0].split("-");
        String[] end = first[1].split("-");
        String startS = start[0]+start[1]+start[2];
        startPeriod = Integer.parseInt(startS);
        String endS = end[0]+end[1]+end[2];
        endPeriod = Integer.parseInt(endS);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPeriod() {
        return periodStr;
    }

    public String getWorkingHours() {
        return null;
    }

    public Integer getStartPeriod() {
        return startPeriod;
    }

    public Integer getEndPeriod() {
        return endPeriod;
    }

    public Boolean isInService(String period){

        String[] first = period.split(" to ");
        String[] start = first[0].split("-");
        String[] end = first[1].split("-");
        String startS = start[0]+start[1]+start[2];
        Integer init = Integer.parseInt(startS);
        String endS = end[0]+end[1]+end[2];
        Integer fin = Integer.parseInt(endS);

        if(this.startPeriod<=init && this.endPeriod>=fin) return true;
        return false;

    }

    
}
