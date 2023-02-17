package Day5_Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class player implements Comparator<player>{
    private String playername;
    private String country;
    private String skill;
    private int runs;
    
    public player() {
    }
    public player(String playername, String country, String skill, int runs) {
        this.playername = playername;
        this.country = country;
        this.skill = skill;
        this.runs = runs;
    }
    public String getPlayername() {
        return playername;
    }
    public void setPlayername(String playername) {
        this.playername = playername;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    @Override
    public String toString() {
        return "player playername=" + playername + ", country=" + country + ", skill=" + skill + ", runs=" + runs ;
    }
    // @Override
    // public int compare(player o1, player o2) {
    //     // TODO Auto-generated method stub
    // if(o1.getRuns() > o2.getRuns()){
    //     return 1;
    // }else if(o1.getRuns() < o2.getRuns()){
    //     return -1;
    // }else{
    //     return 0;
    // }
    // }

    
}









public class demo {
    public static void main(String[] args) {
        ArrayList<player> al = new ArrayList<player>();
        al.add(new player("virat","india","bat",120));
        al.add(new player("aohit","india","bat2",119));
        System.out.println("given order");
        for(player p1 : al){
            System.out.println(al);
        }


        System.out.println("name based");
        Comparator c = new Comparator<player>() {
            @Override
            public int compare(player o1, player o2) {
                return o1.getPlayername().compareToIgnoreCase(o2.getPlayername());
            
            }
        };
        Collections.sort(al,c);
        for(player p2 : al){
            System.out.println(al);
        }


        System.out.println("run based");
        Comparator c2 = new Comparator<player>() {
            @Override
            public int compare(player o1, player o2) {
                if(o1.getRuns() > o2.getRuns()){
                    return 1;
                }else if(o1.getRuns() < o2.getRuns()){
                    return -1;
                }else{
                    return 0;
                }
            
            }
        };
        Collections.sort(al,c2);
        for(player p3 : al){
            System.out.println(al);
        }

        // Collections.sort(al,);
    }
}
