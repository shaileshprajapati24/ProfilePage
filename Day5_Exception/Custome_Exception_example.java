package Day5_Exception;

import java.util.Scanner;

public class Custome_Exception_example extends CustomException {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the player name");
        String player_name = sc.nextLine();
        System.out.println("Enter the player age");
        int player_age = sc.nextInt();
        if(player_age < 19){
            throw new CustomException();
        }else{

            System.out.println("Player Name : "+player_name);
            System.out.println("Player age : "+player_age);
        }
        
        
            
         }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
