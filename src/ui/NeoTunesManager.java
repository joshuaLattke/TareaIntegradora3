package ui;

import java.util.Date;
import java.util.Scanner;
import model.NeoTunesController;

public class NeoTunesManager{
   
    public static Scanner sc=new Scanner(System.in);
    
    public static NeoTunesController neoTunesController= new NeoTunesController();
    
    public static void main (String  args[]){
       
        menu();
    }
    public static void menu(){
        System.out.println("Welcome to NeoTunes");
        
        boolean exit=false;
        int option;

        while(!exit){
            System.out.println(" 1. Register user producer\n 2. Register  user consumer \n 3. Register user standard \n 4. Register user Premium\n 5. Register Song \n 6. Register Podcast\n 7. create Playist\n 8.edit Playist\n 9. exit");
            option=sc.nextInt();

        switch (option) {
              case 1:
                RegisterProducer();
            break;
            case 2:
                RegisterConsumer();
            break;
            case 3:
                RegisterUserStandard();
            break;
            case 4:
                RegiterUserPremium();
            break;
            case 5:
                RegisterSong();
                break;
            case 6: 
                registerPodcast();
                break;
            case 7:
                createdPlayist();
            break;
            case 8:
                editPlayist();
            break;    
            case 9:
                exit=true;
            break; 
                default:
            System.out.println("type correctly the options ");
                break;
            }
        }
    }
    private  static void RegisterConsumer(){
        System.out.println("enter your name");
        
        String name =sc.nextLine();

        System.out.println("enter your date of afilition");

         Date dateOfAfilition=sc

         System.out.println("enter your cedula");

         String cedula=sc.nextLine();

         int timeOfReproduction;

         if(NeoTunesController.RegisterUser(name,  dateOfAfilition,  cedula, timeOfReproduction)){
            System.out.println("correctly registered");
        
        }else{
            
            System.out.println("type correctly");
         
            }

    
        }
        private static void  RegisterProducer(){

        }
        private static void RegisterUserStandard(){

        }
        private static void RegiterUserPremium(){

        }
        private static void RegisterSong(){

        }
        private static void registerPodcast(){

        }
        private static void createdPlayist(){

        }
        private static void editPlayist(){

        }
}