// package Day4;

class person {
    private String name;
    private String email;
    // public person(String name1,String email1){

    // }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String em) {
        this.email = em;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

}

public class personMain {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Ravi");
        p.setEmail("ravi@gmail.com");
        System.out.println("Name : " + p.getName());
        System.out.println("Email : " + p.getEmail());
    }
}
