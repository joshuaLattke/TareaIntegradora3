package model;

public class Podcast extends Audio {
    

    private String description;

    private Typepodcast category;

     public Podcast(String name, String url, int duration, int numberOfReproduction, String description,
            Typepodcast category) {
        super(name, url, duration, numberOfReproduction);
        this.description = description;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Typepodcast getCategory() {
        return category;
    }

    public void setCategory(Typepodcast category) {
        this.category = category;
    }

}
