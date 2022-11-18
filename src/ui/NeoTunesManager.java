package ui;

import java.time.LocalDate;
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
        
    }
    public void menu(){
        System.out.println("Welcome to NeoTunes");
        
    

        while(!exit){
            System.out.println(" 1. Register user\n 2. Register  Song \n 3. Register podcast \n 4. CreatedPlayist\n 5. Edit playist \n 6. exit");
            int option = sc.nextInt();
			sc.nextLine();

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
            System.out.println("1. Register Consumer\n 2.Register Producer\n 3. go back");
            
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
            
            System.out.println("1. Register user Standard \n 2. Register user Premium\n 3. Go back");
            
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
        
        sc.nextLine();

        System.out.println("enter your name");
        
        String name =sc.nextLine();

         System.out.println("enter your cedula");

         int  cedula=sc.nextInt();

         System.out.println("register time of reproduction ");

         int timeOfReproduction=sc.nextInt();

         System.out.println("enter your date of afilition");

        LocalDate dateOfAfilition =LocalDate.now();

         if(neoTunesController.registerUseStandard(name,  dateOfAfilition,  cedula, timeOfReproduction)){
            System.out.println("correctly registered");
        
        }else{
            
            System.out.println("type correctly");
         
            }

    }
    public  void RegisterUserPremium(){

        sc.nextLine();

        System.out.println("enter your name");
        
        String name =sc.nextLine();

         LocalDate dateOfAfilition=LocalDate.now();

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

    
    
    public  void Artist(){

        sc.nextLine();

        System.out.println(" register artist");

        System.out.println("register name");

        System.out.println("enter your name");
        
        String name =sc.nextLine();

         System.out.println("enter your cedula");

         int  cedula=sc.nextInt();

        System.out.println("register time of reproduction");

         int timeOfReproduction=sc.nextInt();

         System.out.println("enter your date of afilition");

         LocalDate dateOfAfilition=LocalDate.now();

         if(neoTunesController.registerArtist(name, dateOfAfilition, cedula, timeOfReproduction)){
            System.out.println("the name cannot be repeated");
         }else{
            System.out.println("the name cannot be repeated");
         }


    }
    public  void ContenCreator(){

        sc.nextLine();

        System.out.println("enter your name");
        
        String name =sc.nextLine();
        
        System.out.println("Regisrer time of reproductioin");

        int timeOfReproduction=sc.nextInt();
        System.out.println("enter your cedula");

        int  cedula=sc.nextInt();

        System.out.println("register date");

         LocalDate dateOfAfilition= LocalDate.now();

        
         if(neoTunesController.registerContenCreator(name, dateOfAfilition, cedula, timeOfReproduction)){
                System.out.println("properly registered");

            }else{
                System.out.println("the name cannot be repeated");
            }
    }
    public  void createdPlayist(){

        sc.nextLine(); 

        System.out.println( "enter the user's name");

        String name=sc.nextLine();

        System.out.println(" register name for playist");

        String namePlayist=sc.nextLine();

        if(neoTunesController.createdPlayist(name, namePlayist)){
            System.out.println("correct creation of the playist");
        }else{
            System.out.println("type in the options correctly ");
        }

    }
    public  void registerSong(){

        sc.nextLine();

        System.out.println("enter the user name");

        String name=sc.nextLine();

        System.out.println("register song ");
        
        System.out.println("register name");
        
        String nameAP=sc.nextLine();

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
            System.out.println("1. House\n 2.Pop\n 3. Rock\n 4.Trap");
        
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

            if(neoTunesController.registerSong(nameAP, url, duration, numberOfReproduction, album, salesValue, numberOftimesSold, genre)){
                System.out.println("correct registration");

            }else{
                System.out.println("type another name");
            }




    }
    public  void editPlayist(){
    System.out.println("enter your username");

    String name=sc.nextLine(); 
    if(neoTunesController.){

        System.out.println("the user if he is a consumer ");
        
        while(!exit){

            System.out.println("1. Add\n 2. Remove \n 3. Go back");
        
            int option=sc.nextInt();
             switch(option){
             case 1: 
                add();
             break;
             case 2:
                remove();
              break;
            case 3:
                exit=true;
                break;
            default:
            System.out.println("type in the options correctly "); 
            break;     
            }

                 }else{
                System.out.println("the user if he is a consumer ");
                 }
     
   
    }


    }
    public void registerPodcast(){
      System.out.println("Register podacast");
      
        System.out.println("register name ");

        String nameAP=sc.nextLine(); 
    
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
            
                    if(neoTunesController.registerPodcast(nameAP, url, duration, numberOfReproduction, description, category)){
                
                    System.out.println("correct registrion");
            
                    }else{
                
                    System.out.println("type another name");
                    }
    }
    public void add(){
        while(!exit){

            int option=sc.nextInt();
            switch(option){
                case 1:
                addSong();
                break;
                case 2:
                addPodcast();
                break;
                case 3:
                exit=true;
                break;
                default:
                System.out.println("type correctly the options");
                break;

            }
        }
    }
    public void remove(){
        while(!exit){

            int option=sc.nextInt();
            switch(option){
                case 1:
                removeSong();
                break;
                case 2:
                removePodcast();
                break;
                case 3:
                exit=true;
                break;
                default:
                System.out.println("type correctly the options");
                break;

            }
        }
    }

}

    
