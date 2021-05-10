package Entities;

import java.time.LocalDate;

public class Gamer {
    private int id;
    private String gamerName;
    private String gamerLastName;
    private String nationalityId;
    private LocalDate DateOfBirth;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    public String getGamerLastName() {
        return gamerLastName;
    }

    public void setGamerLastName(String gamerLastName) {
        this.gamerLastName = gamerLastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId =nationalityId;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.DateOfBirth= dateOfBirth;
    }
}
