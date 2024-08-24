package it.polito.emergency;

public class Report {

    private static final int BASE =1;
    private static int INCREMENT =0;

    //String professionalId, String fiscalCode, String date, String description
    
    private int id;
    private String professionalId;
    private String fiscalCode;
    private String date;
    private String description;

    
    public Report(String professionalId, String fiscalCode, String date, String description) {
        this.professionalId = professionalId;
        this.fiscalCode = fiscalCode;
        this.date = date;
        this.description = description;
        this.id = BASE + INCREMENT++;
    }

    public int getId() {
        return id;
    }

    public String getProfessionalId() {
        return professionalId;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public String getDate() {
        return date;
    }


    public String getDescription() {
        return description;
    }
}
