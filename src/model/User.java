package model;

import java.util.Date;

public  class User {
    private String name;
    private Date dateOfAfilition;
    private int cedula;
    private int timeOfReproduction;
    
    public User(String name, Date dateOfAfilition, int cedula, int timeOfReproduction) {
        this.name = name;
        this.dateOfAfilition = dateOfAfilition;
        this.cedula = cedula;
        this.timeOfReproduction = timeOfReproduction;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateOfAfilition() {
        return dateOfAfilition;
    }
    public void setDateOfAfilition(Date dateOfAfilition) {
        this.dateOfAfilition = dateOfAfilition;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public int getTimeOfReproduction() {
        return timeOfReproduction;
    }
    public void setTimeOfReproduction(int timeOfReproduction) {
        this.timeOfReproduction = timeOfReproduction;
    }
   
}