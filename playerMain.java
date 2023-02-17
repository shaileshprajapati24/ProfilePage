import java.util.ArrayList;
import java.util.TreeSet;

class player implements Comparable<player> {
    private String playername;
    private String country;
    private String skills;
    private int runs;

    public player() {
    }

    public player(String playername, String country, String skills, int runs) {
        this.playername = playername;
        this.country = country;
        this.skills = skills;
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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "player [playername=" + playername + ", country=" + country + ", skills=" + skills + ", runs=" + runs
                + "]";
    }

    @Override
    public int compareTo(player o) {
        // TODO Auto-generated method stub
        return this.playername.compareTo(o.getPlayername());
    }

}

public class playerMain {
    public static void main(String[] args) {
        // player p1= new player("Virat", "India", "Batsman");
        // System.out.println(p1);

        // ArrayList<player> a1 = new ArrayList<player>();
        TreeSet<player> a1 = new TreeSet<player>();
        a1.add(new player("Virat", "India", "Batsman", 120));
        a1.add(new player("jadeja", "Australia", "Batsman1", 121));
        a1.add(new player("Virat", "India2", "Batsman2", 124));
        // System.out.println(a1);
        for (player p1 : a1) {
            System.out.println(a1);
        }

    }
}
