//  package Day4;

class person {
    private String name;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

}

class Employee extends person {
    private String designation;

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return this.designation;
    }
}

public class inheritance {
    public static void main(String[] args) {
            
            Employee e1 = new Employee();

            e1.setName("Ravi");
            e1.setEmail("ravi@gmail.com");
            e1.setDesignation("Engineer");
            System.out.println("Name : "+e1.getName());
            // System.out.println("Email : "e1.getEmail());
            System.out.println("Email : "+e1.getEmail());
            System.out.println("Designation : "+e1.getDesignation());
        }

}
