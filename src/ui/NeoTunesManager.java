package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.NeoTunesController;
import model.TypeGenre;
import model.Typepodcast;

public class NeoTunesManager{
   
    public static Scanner sc=new Scanner(System.in);

     
    
    public static NeoTunesController neoTunesController= new NeoTunesController();

    public static boolean exit=false;
    
    public NeoTunesManager(){

    }
    
    public static void main (String args[]){
        NeoTunesManager nm = new NeoTunesManager();
        nm.menu();
        Date dateOfAfilition = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("DD/MM/YYYY");
        String 
    }
    public void menu(){
        System.out.println("Welcome to NeoTunes");
        
        boolean exit=false;
        int option;

        while(!exit){
            System.out.println(" 1. Register user producer\n 2. Register  user consumer \n 3. Register user standard \n 4. Register user Premium\n 5. Register Song \n 6. Register Podcast\n 7. create Playist\n 8.edit Playist\n 9. exit");
            option=sc.nextInt();

        switch (option) {
              case 1:
                RegisterUser();
            break;
            case 2:
                registerSong();
                break;
            case 3: 
                registerPodcast();
                break;
            case 4:
                createdPlayist();
            break;
            case 5:
                editPlayist();
            break;    
            case 6:
                exit=true;
            break; 
                default:
            System.out.println("type correctly the options ");
                break;
            }
        }
    }
    public   void RegisterUser(){
            System.out.println("select user type ");
        
            boolean exit=false;
        
            int option;
        
        while(!exit){
            System.out.println("1. Register Consumer\n 2.Register Producer");
            
            option=sc.nextInt();
            
            switch(option){
                case 1: 
                    RegisterConsumer();
                break;
                case 2:
                    RegisterProducer();
                break;
                case 3:
                    exit=true;
                break;
                    default:
                    System.out.println("type correctly the options ");
                break;
            }
        }    

    }
     public   void  RegisterConsumer(){
        System.out.println("select user type ");
        
        boolean exit=false;
        
        int option;
        
        while(!exit){
            
            System.out.println("1. Register user Standard \n 2. Register user Premium");
            
            option=sc.nextInt();
        
        switch (option) {
            case 1:
                RegisterUserStandard();
                break;
            case 2:
                RegisterUserPremium();
            break;
            case 3: 
                exit=true;
            default:
                System.out.println("type correctly the options ");
                break;
            }   
        }
    }
    public   void RegisterUserStandard(){
        System.out.println("enter your name");
        
        String name =sc.nextLine();

        System.out.println("enter your date of afilition");

         Date dateOfAfilition;

         System.out.println("enter your cedula");

         int  cedula=sc.nextInt();

         System.out.println("register time of reproduction ");

         int timeOfReproduction=sc.nextInt();

         if(neoTunesController.registerUseStandard(name,  dateOfAfilition,  cedula, timeOfReproduction)){
            System.out.println("correctly registered");
        
        }else{
            
            System.out.println("type correctly");
         
            }

    }
    public  void RegisterUserPremium(){
        System.out.println("enter your name");
        
        String name =sc.nextLine();

        System.out.println("enter your date of afilition");

         Date dateOfAfilition;

         System.out.println("enter your cedula");

         int  cedula=sc.nextInt();

         System.out.println("register time of reproduction");

         int timeOfReproduction=sc.nextInt();

         if(neoTunesController.registerUserPremium(name,  dateOfAfilition,  cedula, timeOfReproduction)){
            System.out.println("correctly registered");
        
        }else{
            
            System.out.println("type correctly");
         
            }
    }
    public  void RegisterProducer(){
        System.out.println("select the type of player");
        
        boolean exit=false;
        
        int option;
        
        
        while(!exit){
            System.out.println("1. Register Created \n 2. RegisterContenCreator");

             option=sc.nextInt();

            switch(option){
                case 1:
                 Artist();
                 break;
                 case 2:
                ContenCreator();
                case 3:
                    exit=true;
                break;
                default:
                    System.out.println("type correctly the options ");
                break;
            }
        }
    }

    public  void RegisterSong(){
        System.out.println("register Song ");
        
        System.out.println("");
    }
    public static void Artist(){
        System.out.println(" register artist");

        System.out.println("register name");

        System.out.println("enter your name");
        
        String name =sc.nextLine();

        System.out.println("enter your date of afilition");

         Date dateOfAfilition;

         System.out.println("enter your cedula");

         int  cedula=sc.nextInt();

        System.out.println("register time of reproduction");

         int timeOfReproduction=sc.nextInt();

         if(neoTunesController.registerArtist(name, dateOfAfilition, cedula, timeOfReproduction)){
            System.out.println("the name cannot be repeated");
         }else{
            System.out.println("the name cannot be repeated");
         }


    }
    public  void ContenCreator(){

        System.out.println("register ContentCreator");

        System.out.println("register name");

        System.out.println("enter your name");
        
        String name =sc.nextLine();

        System.out.println("enter your date of afilition");

         Date dateOfAfilition;

         System.out.println("enter your cedula");

         int  cedula=sc.nextInt();

         System.out.println("Regisrer time of reproductioin");

         int timeOfReproduction=sc.nextInt();

            if(neoTunesController.registerContenCreator(name, dateOfAfilition, cedula, timeOfReproduction)){
                System.out.println("properly registered");

            }else{
                System.out.println("the name cannot be repeated");
            }
    }
    public  void createdPlayist(){

    }
    public  void registerSong(){
        System.out.println("register song ");
        
        System.out.println("register name");
        
        String name=sc.nextLine();

        System.out.println("register url");

        String url=sc.nextLine();

        System.out.println("register duration in the second ");    

        int duration=sc.nextInt();

        System.out.println("register number of reproduction");

        int numberOfReproduction=sc.nextInt();
        
        System.out.println("register album");
        
        String album=sc.nextLine();

        System.out.println("regsiter sales value ");

        int salesValue=sc.nextInt();

        System.out.println("regiter number of times sold");

        int numberOftimesSold=sc.nextInt();

        System.out.println("register typer genre");
             
        TypeGenre genre=null;
         
            while(!exit){
            System.out.println("1. House 2.Pop 3. Rock 4.Trap");
        
                int option=sc.nextInt();
                        switch(option){
                        case 1:
                        genre = TypeGenre.HOUSE;
                        exit=true;
                        break; 
                        case 2:
                        genre = TypeGenre.POP;
                        exit=true;
                        break;
                        case 3: 
                        genre = TypeGenre.ROCK;
                        exit=true;
                        case 4:
                        genre =TypeGenre.TRAP;
                        exit=true;
                        break;
                        default:
                        System.out.println("type correctly the options");
                        break;

                    }
            }

            if(neoTunesController.registerSong(name, url, duration, numberOfReproduction, album, salesValue, numberOftimesSold, genre)){
                System.out.println("correct registration");

            }else{
                System.out.println("type another name");
            }




    }
    public  void editPlayist(){

    }
    public void registerPodcast(){
      System.out.println("Register podacast");
      
        System.out.println("register name ");

        String name=sc.nextLine(); 
    
        System.out.println("register url ");
      
        String url=sc.nextLine(); 

        System.out.println("regiter duration in seconds ");
      
        int duration=sc.nextInt();

        System.out.println("register number of reproduction");
       
        int numberOfReproduction=sc.nextInt();

        System.out.println("register description");
        
        String description=sc.nextLine();

        Typepodcast category=null;

            while(!exit){
        
                int option=sc.nextInt();
                switch(option){
                    case 1:
                    category =Typepodcast.ENTERTAINMENT;
                    exit=true;
                    break;
                    case 2:
                    category =Typepodcast.FASHION;
                    exit=true;
                    break;
                    case 3:
                    category =Typepodcast.POLITICS;
                    exit=true;
                    break;
                    case 4:
                    category= Typepodcast.VIDEOGAMES;
                    exit=true;
                    break;
                        default:
                        System.out.println("type correctly the options");
                        break;

                }
            }   
            
                    if(neoTunesController.registerPodcast(name, url, duration, numberOfReproduction, description, category)){
                
                    System.out.println("correct registrion");
            
                    }else{
                
                    System.out.println("type another name");
                    }
    }

}

    
