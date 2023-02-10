// Ex02 - 2
import java.util.Scanner;

public class cricket {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int arraysize = scr.nextInt();
        int array[] = new int[arraysize];
        int i;
        if(arraysize < 0){
            System.out.println("Invalid array size");
        }else{
            for( i = 0;i<arraysize;i++){
                array[i] = scr.nextInt();
                if(array[i] < 0){
                    System.out.println("Invalid input");
                }
            }
        }
        int score = scr.nextInt();
        if(score < 0){
            System.out.println("Invalid score");
        }
        if(array[3] > array[1] && array[5] > array[1]){
            System.out.println(array[2]);
            System.out.println(array[4]);
        }

    }
}
