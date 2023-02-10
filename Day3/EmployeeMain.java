import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        
        System.out.println("Enter the name");
        String name1 = sc.nextLine();
        System.out.println("Enter Address");
        String address1 = sc.nextLine();
        System.out.println("Enter mobile");
        String mobile1 = sc.nextLine();

        System.out.println("Employee Details");
        e1.setName(name1);
        e1.setaddress(address1);
        e1.setmobile(mobile1);
        e1.getName();
        e1.getaddress();
        e1.getmobile();
    }
}
