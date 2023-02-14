package Day5_Exception;

import java.util.Scanner;

public class TeamNotFoundException extends Custome_TeamNotFoundException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team[] = { "Chennai Super Kings",
        "Sun Risers",
        "Delhi Daredevils",
        "Kings XI Punjab",
        "Kolkata Knight Riders",
       " Mumbai Indians",
        "Rajasthan Royals",
        "Royal Challengers Bangalore"};

        try{
            System.out.println("Enter the expected winner team of IPL Season 10");
            String winner = sc.nextLine();
            System.out.println("Enter the expected runner team of IPL Season 10");
            String runner = sc.nextLine();
            boolean flag1 = false;
            boolean flag2 = false;
            for(int i=0;i<team.length;i++){
                if(team[i].equalsIgnoreCase(winner)){
                    flag1 = true;
                }
                if(team[i].equalsIgnoreCase(runner)){
                    flag2 = true;
                }

            }
            if(!(flag1 && flag2)){
                throw new Custome_TeamNotFoundException();
            }

            System.out.println("Expected IPL Season 10 winner: " + winner);
			System.out.println("Expected IPL Season 10 runner: " + runner);

        }catch(Custome_TeamNotFoundException ex){
            System.out.println(ex);
        }
    }
}
