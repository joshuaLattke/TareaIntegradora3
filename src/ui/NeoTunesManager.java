package ui;

import java.util.Date;
import java.util.Scanner;
import model.NeoTunesController;

public class NeoTunesManager{
   
    public static Scanner sc=new Scanner(System.in);
    
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
                registerSong();
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
    public static void RegisterConsumer(){
        System.out.println("enter your name");
        
        String name =sc.nextLine();

        System.out.println("enter your date of afilition");

         int dateOfAfilition=sc.nextInt();

         System.out.println("enter your ulr ");

         String url



    }
}