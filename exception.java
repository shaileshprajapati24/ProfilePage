import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

// // default throw and our catch
// public class exception {
//     public static void main(String[] args) {
        
//         try{

//             System.out.println("first try");
//             System.out.println(3/0);
//             System.out.println("second try");
//         }catch(ArithmeticException e){
//             System.out.println("exception : "+e.getMessage());
//          }
//         finally{

//             System.out.println("after ");
//         }
//     }
// }

// public class exception{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the date");
//         String date = sc.nextLine();
//         LocalDate d1= LocalDate.now();
// System.out.println(d1);
// LocalTime t1 = LocalTime.now();
// System.out.println(t1);
// LocalDate ld = LocalDate.parse(date);
// LocalDateTime dt1 = LocalDateTime.now();
// System.out.println(dt1);

// Period p= Period.between(ld,d1);
// System.out.println("Period : "+p);

//     }
// }


public class exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time");
        String Entry_time = sc.nextLine();
        try{
            LocalTime dl1 = LocalTime.parse(Entry_time);
            LocalTime dl2 = LocalTime.now();
            Duration d = Duration.between(dl1, dl2);
            System.out.println("cost is  "+d.toHours()*25);
        }catch(Exception e){
            System.out.println("Enter valid input");
        }
    }
}
