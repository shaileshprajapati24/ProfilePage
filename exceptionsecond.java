// public class exceptionsecond {
//     public static void main(String[] args) {
//         int balance = 5000;
//         int withdrawlAmount = 12000;
//         try {

//             if (balance < withdrawlAmount) {
//                 throw new ArithmeticException("Balance is insufficient");
//             }
//             balance = balance - withdrawlAmount;
//             System.out.println("Transaction completed ");
//         } catch (ArithmeticException e) {
//             System.out.println("Exception : " + e.getMessage());
//         }finally{

//             System.out.println("Program continue.....");
//         }
//     }

// }



class Splendor{
    public void mileage(){
        System.out.println("60Km");
    }
    public void color(){
        System.out.println("Black with violet");
    }
    public void feature(){
        System.out.println("100 cc");
    }
}

class SplendorPlus extends Splendor{
    public void mileage(){
        System.out.println("65km");
    }
}

public class exceptionsecond{
    public static void main(String[] args) {
        
    }
}