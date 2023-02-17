import java.util.HashSet;
import java.util.TreeSet;

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
// hashSet & TreeSet example
public class exceptionsecond{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(30);
        hs.add(33);
        hs.add(1);
        hs.add(88);
        hs.add(1);
        System.out.println(hs);
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(30);
        ts.add(33);
        ts.add(1);
        ts.add(10);
        ts.add(88);
        ts.add(1);
        System.out.println(ts);
    }
}