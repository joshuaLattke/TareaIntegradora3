package model;
import java.util.ArrayList;
import java.util.Date;

public class NeoTunesController{

    public static boolean RegisterUser(String name, Date dateOfAfilition, int cedula, int timeOfReproduction){
        
      
        ArrayList<User>  collection =new ArrayList<User>();

        collection.add( new User (name, dateOfAfilition, cedula, timeOfReproduction));
        collection.add(new UserStandar (name, dateOfAfilition, cedula, timeOfReproduction));
        collection.add(new UserPremium(name, dateOfAfilition, cedula, timeOfReproduction));
        collection.add(new Produce(name, dateOfAfilition, cedula, timeOfReproduction));
        
        for(int i = 0;i < collection.size(); i++){
            
            return true;
       
        }return false;
         
    } 

}