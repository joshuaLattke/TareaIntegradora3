package model;


public class  Playist {
    
    private String name;

    private String audioList;

    private TypePlayist type;
    

    public Playist(String name, String audioList, TypePlayist type) {
        this.name = name;
        this.audioList = audioList;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAudioList() {
        return audioList;
    }

    public void setAudioList(String audioList) {
        this.audioList = audioList;
    }

    public TypePlayist getType() {
        return type;
    }

    public void setType(TypePlayist type) {
        this.type = type;
    }



    

}

