package model;
import java.util.ArrayList;
import java.util.Date;


public class NeoTunesController{
    
     private ArrayList<User>collection; 

     private ArrayList<Audio>collection2;

     private ArrayList<Playist>collection3;

     public  void controllerNeotunes(){

        collection =new ArrayList<User>();

        collection2 =new ArrayList<Audio>();

        collection3= new ArrayList<Playist>();

     }
     
     public boolean registerUserPremium(String name, Date dateOfAfilition, int cedula, int timeOfReproduction){
      
        collection.add(new UserPremium(name, dateOfAfilition, cedula, timeOfReproduction));
         
            for(int i=0; i<collection.size(); i++){
        
                if(name == collection.get(i).getName()){

                    return true;
                 }
             }return false; 
        }         

    public boolean registerUseStandard(String name, Date dateOfAfilition, int cedula, int timeOfReproduction){

        collection.add(new UserStandar(name, dateOfAfilition, cedula, timeOfReproduction));

        for(int i=0; i<collection.size(); i++){

            if(name.equals(collection.get(i).getName())){

                return true;
            }
        }return false;
    }

    public boolean registerArtist(String name, Date dateOfAfilition, int cedula, int timeOfReproduction){
         
        collection.add(new Artist(name, dateOfAfilition, cedula, timeOfReproduction));

        for(int i=0; i<collection.size(); i++){

            if(name.equals(collection.get(i).getName())){
                
                return true;
            }

        }return false;
    }

    public boolean registerContenCreator(String name, Date dateOfAfilition, int cedula, int timeOfReproduction){

        collection.add(new ContentCreator(name, dateOfAfilition, cedula, timeOfReproduction));

        for (int i=0; i<collection.size(); i++){

            if(name.equals(collection.get(i).getName())){
                return true;
            }
            

        }return false;
    }

    public boolean registerSong(String name, String url, int duration, int numberOfReproduction, String album, int salesValue,
    int numberOftimesSold, TypeGenre genre){

        collection2.add( new Song(name, url, duration, numberOfReproduction, album, salesValue, numberOfReproduction , genre));
         
        for (int i=0; i<collection.size(); i++){

            if(name.equals(collection.get(i).getName())){
                return true;
            }

        }return false;
    }

    public boolean registerPodcast(String name, String url, int duration, int numberOfReproduction, String description,
    Typepodcast category){

        collection2.add(new Podcast(name, url, duration, numberOfReproduction, description, category));

            for (int i=0; i<collection.size(); i++){

                if(name.equals(collection.get(i).getName())){
                    return true;
                }

        }return false;
        
    }
}        

        

    