// Ex02 - 1
import java.util.Scanner;

public class array_EvenSum_OddSum {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int number ;

        // public void sumarray(int arr[] ,int number){

        int sumOdd = 0;
        int sumEven = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid array size");
        } else {
            int arr[] = new int[number];

            for (int i = 0; i < number; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < number; i++) {
                if (arr[i] % 2 == 0) {
                    sumEven = sumEven + arr[i];
                } else {
                    sumOdd = sumOdd + arr[i];
                }
            }
            if (sumEven > sumOdd) {
                System.out.println(sumEven);
            } else {
                System.out.println(sumOdd);

            }
        }
    }
}
