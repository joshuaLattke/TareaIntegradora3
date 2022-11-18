package model;

import java.time.LocalDate;

public  class User {
    private String name;
    private LocalDate dateOfAfilition;
    private int cedula;
    private int timeOfReproduction;
    
    public User(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction) {
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
    public LocalDate getDateOfAfilition() {
        return dateOfAfilition;
    }
    public void setDateOfAfilition(LocalDate dateOfAfilition) {
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
    public boolean addPlaylist(Playist playist) {
        return false;
    }
   
}