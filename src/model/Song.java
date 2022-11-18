package model;

public class Song extends Audio{
    
     private String album;

    private int salesValue;

    private  int numberOftimesSold;
    
    private TypeGenre genre;

    public Song(String nameAP, String url, int duration, int numberOfReproduction, String album, int salesValue,
            int numberOftimesSold, TypeGenre genre) {
        super(nameAP, url, duration, numberOfReproduction);
        this.album = album;
        this.salesValue = salesValue;
        this.numberOftimesSold = numberOftimesSold;
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(int salesValue) {
        this.salesValue = salesValue;
    }

    public int getNumberOftimesSold() {
        return numberOftimesSold;
    }

    public void setNumberOftimesSold(int numberOftimesSold) {
        this.numberOftimesSold = numberOftimesSold;
    }

    public TypeGenre getGenre() {
        return genre;
    }

    public void setGenre(TypeGenre genre) {
        this.genre = genre;
    }

}
