package it.polito.emergency;

import it.polito.emergency.EmergencyApp.*;

public class Patient {

    //String fiscalCode, String name, String surname, String dateOfBirth, String reason, String dateTimeAccepted

    private String fiscalCode;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String reason;
    private String dateTimeAccepted;
    private Integer dateAcceptedInt;
    private PatientStatus status;


    public Patient(String fiscalCode, String name, String surname, String dateOfBirth, String reason,
            String dateTimeAccepted) {
        this.fiscalCode = fiscalCode;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.reason = reason;
        this.dateTimeAccepted = dateTimeAccepted;

        String[] first = dateTimeAccepted.split("-");
        String dateStr = first[0]+first[1]+first[2];
        dateAcceptedInt = Integer.parseInt(dateStr);
    }


    public String getFiscalCode() {
        return fiscalCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getReason() {
        return reason;
    }

    public String getDateTimeAccepted() {
        return dateTimeAccepted;
    }

    public PatientStatus getStatus() {
        return status;
    }

    public void setStatus(PatientStatus s){
        this.status=s;
    }


    public Integer getDateAcceptedInt() {
        return dateAcceptedInt;
    }

    
}
