package model;


public  abstract class  Audio {
    private String name;

    private String url;

    private int duration;

    private int numberOfReproduction;

    public Audio(String name, String url, int duration, int numberOfReproduction) {
    this.name = name;
    this.url = url;
    this.duration = duration;
    this.numberOfReproduction = numberOfReproduction;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
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
