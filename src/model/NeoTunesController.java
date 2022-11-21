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
     
     /**register premium user, without the repetition of the name
     * @param name
     * @param dateOfAfilition
     * @param cedula
     * @param timeOfReproduction
     * @return true or false
     */
    public boolean registerUserPremium(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){
      
        users.add(new UserPremium(name, dateOfAfilition, cedula, timeOfReproduction));
         
            for(int i=0; i<users.size(); i++){
        
                if(name == users.get(i).getName()){

                    return true;
                 }
             }return false; 
        }         

    /** register uuser standard, without the repetition of the name
     * @param name
     * @param dateOfAfilition
     * @param cedula
     * @param timeOfReproduction
     * @return
     */
    public boolean registerUseStandard(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){

        users.add(new UserStandar(name, dateOfAfilition, cedula, timeOfReproduction));

        for(int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){

                return true;
            }
        }return false;
    }

    /** register user artist,without the repetition of the name 
     * @param name
     * @param dateOfAfilition
     * @param cedula
     * @param timeOfReproduction
     * @return
     */
    public boolean registerArtist(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){
         
        users.add(new Artist(name, dateOfAfilition, cedula, timeOfReproduction));

        for(int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){
                
                return true;
            }

        }return false;
    }

    /** register user ContentCreator, without the repetition of the name
     * @param name
     * @param dateOfAfilition
     * @param cedula
     * @param timeOfReproduction
     * @return true or false;
     */
    public boolean registerContenCreator(String name, LocalDate dateOfAfilition, int cedula, int timeOfReproduction){

        users.add(new ContentCreator(name, dateOfAfilition, cedula, timeOfReproduction));

        for (int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){
                return true;
            }
            

        }return false;
    }
    /**comparison of the name creation and adding the song objects
     * @param nameAP
     * @param url
     * @param duration
     * @param numberOfReproduction
     * @param album
     * @param salesValue
     * @param numberOftimesSold
     * @param genre
     * @return true of false
     */
    public boolean addSong(String nameAP, String url, int duration, int numberOfReproduction, String album, int salesValue,
    int numberOftimesSold, TypeGenre genre){
        
        for (int i=0; i<audios.size(); i++){

            if(nameAP.equals(audios.get(i).getNameAP())){

                return false;
            }
        }
        
                audios.add( new Song(nameAP, url, duration, numberOfReproduction, album, salesValue, numberOfReproduction , genre));
                return true;

    }


    /**validation of the artist's name
     * @param name
     * @param nameAp
     * @param url
     * @param duration
     * @param numberOfReproduction
     * @param album
     * @param salesValue
     * @param numberOftimesSold
     * @param genre
     * @return true or false;
     */
    public boolean registerSong(String name, String nameAp, String url, int duration, int numberOfReproduction, String album, int salesValue,
    int numberOftimesSold, TypeGenre genre){

        for (int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){

                if(users.get(i) instanceof Artist){

                    return addSong(nameAp,url,duration,numberOfReproduction,album,salesValue,numberOftimesSold,genre);
    
                }
            }
        }
        return false;
    }

    /**validation of the name is not repeated and adding the other objects
     * @param nameAP
     * @param url
     * @param duration
     * @param numberOfReproduction
     * @param description
     * @param category
     * @return true or false;
     */
    public boolean addPodcast(String nameAP, String url, int duration, int numberOfReproduction, String description,
    Typepodcast category){

        for (int i=0; i<audios.size(); i++){
            if(nameAP.equals(audios.get(i).getNameAP())){

                return false;

            }
        }
        audios.add(new Podcast(nameAP, url, duration, numberOfReproduction, description, category));
        return true;

    }

    /**name validation with the content creator 
     * @param name name creater
     * @param nameAP name playist
     * @param url Strign
     * @param duration duraito
     * @param numberOfReproduction
     * @param description decriptio
     * @param category
     * @return true or false;
     */
    public boolean registerPodcast(String name, String nameAP, String url, int duration, int numberOfReproduction, String description,
    Typepodcast category){
        for (int i=0; i<users.size(); i++){

            if(name.equals(users.get(i).getName())){

                if(users.get(i) instanceof ContentCreator){
                    return addPodcast(nameAP, url, duration, numberOfReproduction, description, category);
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
    /**comparison of the name of the playist
     * @param namePlayist register name platyist
     * @return true or false;
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

   /*  public boolean standardUser(String name){
        UserStandar newstandar=new  standar (name);
        
        for(int=i; 0< standar.length; i++){
            if(standar[i]==null){
                standar[i]=standar;
                return true;
            }

        }
        return false;
     */

    /**created playist
     * @param name register user
     * @param namePlayist register name playist
     * @return true or false
     */
    public boolean createdPlayist(String name, String namePlayist){

        for (int i=0; i<users.size(); i++){
                if(name.equals(users.get(i).getName())){
                    if(users.get(i) instanceof UserPremium){
                        
                        return addPlaylist(namePlayist);
                    }
                }
        }
        return false;
    }


    /**
     * @param namePlayist
     * @param audioList
     * @param type
     * @param name
     * @return
   
    public void editPlayist(String namePlayist, String audioList, TypePlayist type, String name){

        ///playlist.set(int index(new Playist(namePlayist, audioList, type));
        for (int i=0; i<playlist.size(); i++){

                if(name.equals(users.get(i).getName())){
                return true;
                }

        }return false;

    }
  */


}        

        

    