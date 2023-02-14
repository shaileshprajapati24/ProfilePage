import java.util.ArrayList;
class em{
    private String name;
    private String email;
    public String getName() {
        return name;
    }
    
    public em(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }
    // @Override
    // public String toString() {
    //     return "em [name=" + name + ", email=" + email + ", location=" + location + "]";
    // }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "em [name=" + name + ", email=" + email + ", location=" + location + "]";
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    private String location;
}
public class collection{

public static void main(String[] args) {
    
    ArrayList <Integer> al = new ArrayList<Integer>();
    al.add(12);
    al.add(1);
    // al.add("ravi");
    al.add(0, 24);

// al.add(new em("xyz", 20));
System.out.println(al);
al.add(12);
al.add(23);
// al.add("dhdh");
for(int i :al){
    System.out.println(i);
}
al.remove(0);
System.out.println(al);


ArrayList<em> al1 = new ArrayList<em>();
al1.add(new em("ravi","email.com","address1"));
al1.add(new em("ravi2","email1.com2","address2"));
// al1.add(new em(""))

for(em el : al1){
    System.out.println(el.getName() + " "+el.getLocation());
}
System.out.println(al1);
// System.out.println(al);
}
}