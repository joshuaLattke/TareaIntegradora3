package model;


public  abstract class  Audio {
    private String nameAP;

    private String url;

    private int duration;

    private int numberOfReproduction;

    public Audio(String nameAP, String url, int duration, int numberOfReproduction) {
    this.nameAP = nameAP;
    this.url = url;
    this.duration = duration;
    this.numberOfReproduction = numberOfReproduction;
    }

    public String getNameAP() {
    return nameAP;
    }

    public void setName(String nameAP) {
        this.nameAP = nameAP;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumberOfReproduction() {
        return numberOfReproduction;
    }

    public void setNumberOfReproduction(int numberOfReproduction) {
        this.numberOfReproduction = numberOfReproduction;
    }
    
}
