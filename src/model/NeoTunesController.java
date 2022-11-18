package model;
import java.util.ArrayList;
import java.time.LocalDate;



public class NeoTunesController{
    
     private ArrayList<User>users; 

     private ArrayList<Audio>audios;

    private ArrayList<Playist>playlist;

    

     public NeoTunesController(){

        users =new ArrayList<User>();

        audios =new ArrayList<Audio>();
          
        playlist= new ArrayList<Playist>();
    
 
     }
     
     public boolean registerUserPremium(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){
      
        users.add(new UserPremium(name, dateOfAfilition, cedula, timeOfReproduction));
         
            for(int i=0; i<users.size(); i++){
        
                if(name == users.get(i).getName()){

                    return true;
                 }
             }return false; 
        }         

    public boolean registerUseStandard(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){

        users.add(new UserStandar(name, dateOfAfilition, cedula, timeOfReproduction));

        for(int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){

                return true;
            }
        }return false;
    }

    public boolean registerArtist(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){
         
        users.add(new Artist(name, dateOfAfilition, cedula, timeOfReproduction));

        for(int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){
                
                return true;
            }

        }return false;
    }

    public boolean registerContenCreator(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){

        users.add(new ContentCreator(name, dateOfAfilition, cedula, timeOfReproduction));

        for (int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){
                return true;
            }
            

        }return false;
    }
    public boolean addSong(){
        
    }


    public boolean registerSong(String nameAP, String url, int duration, int numberOfReproduction, String album, int salesValue,
    int numberOftimesSold, TypeGenre genre){

        audios.add( new Song(nameAP, url, duration, numberOfReproduction, album, salesValue, numberOfReproduction , genre));
         
        for (int i=0; i<users.size(); i++){

            if(nameAP.equals(users.get(i).getName())){
                if(users.get(i) instanceof Artist){
                    return true;
                }
                return true;
            }

        }return false;
    }

    public boolean registerPodcast(String nameAP, String url, int duration, int numberOfReproduction, String description,
    Typepodcast category){

        audios.add(new Podcast(nameAP, url, duration, numberOfReproduction, description, category));

            for (int i=0; i<users.size(); i++){

                if(nameAP.equals(users.get(i).getName())){
                    if(users.get(i) instanceof ContentCreator){
                    return true;
                }
            }

        }return false;
        
    }

    /*public  void  verfifyUser(String name){
        for (int i=0; i<users.size(); i++){
            
            users c= users.get(i);
            
            if(c.getName().equals(UserPremium.getName())){

            }
        }



    }
    */
    /*public boolean searchUser(String name){
        
        users.get(i).getName()
        for (int i=0; i<playlist.size(); i++){

            if(name.equals(users.get(i).getName())){
                
            }return true;
            
        }return false;
      
        

    }
    */
    public  boolean  addPlaylist(String namePlayist){ 
        for (int i=0; i<playlist.size();i++){

                if(namePlayist.equals(playlist.get(i).getNamePlayist())){
                    return false;
                }
            }


            playlist.add(new Playist(namePlayist));
        return true;        
    }

    public boolean createdPlayist(String name, String namePlayist){

        for (int i=0; i<users.size(); i++){
                if(name.equals(users.get(i).getName())){
                    if(users.get(i) instanceof Consumer){
                        return addPlaylist(namePlayist);
                    }
                }
        }
        return false;
    }


    public boolean editPlayist(String namePlayist, String audioList, TypePlayist type, String name){

        ///playlist.set(int index(new Playist(namePlayist, audioList, type));
        for (int i=0; i<playlist.size(); i++){

                if(name.equals(users.get(i).getName())){
                return true;
                }

        }return false;

    }



}        

        

    