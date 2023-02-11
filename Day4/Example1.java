import java.util.Scanner;

class Vehicle {
   protected String make;
   protected String vehicleNumber;
   protected String fuelType;
   protected Integer fuelCapacity;
   protected Integer cc;

    public Vehicle(String make,
    String vehicleNumber,
    String fuelType,
    Integer fuelCapacity,
    Integer cc){
this.make = make;
       this. vehicleNumber = vehicleNumber;
       this. fuelType = fuelType;
       this. fuelCapacity = fuelCapacity;
       this. cc = cc;
    }
    Scanner sc = new Scanner(System.in);
    public void displaymake(){
        System.out.println("Vehicle Make : " );
        make = sc.nextLine();
    }
    public void displayBasicInfo(){

    }
    public void displayDetailInfo(){

    }


}

class TwoWheeler extends Vehicle{
   protected boolean kickStartAvailable;

    public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc, boolean kickStartAvailable) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        //TODO Auto-generated constructor stub

        this.kickStartAvailable = kickStartAvailable;
    }
    public void displayDetailInfo(){

    }

}

class FourWheeler extends Vehicle{
   protected String  audioSystem;

 protected Integer numberOfDoors;

    public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc,boolean kickStartAvailable,String) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        //TODO Auto-generated constructor stub
    }
    public void displayDetailInfo(){

    }
    
}

public class Example1 {

}
