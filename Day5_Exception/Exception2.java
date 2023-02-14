package Day5_Exception;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of overs");
        int over_num = sc.nextInt();
        int [] over = new int[over_num];

        System.out.println("Enter the number of runs for each over ");
        for(int i = 0;i<over.length;i++){
            over[i]  = sc.nextInt();
        }
        System.out.println("Enter the over number ");
        int temp = sc.nextInt();
        System.out.println("Runs scored in this over :" +over[temp-1]);

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }catch(NegativeArraySizeException e1){
        System.out.println(e1);
    }
    catch(Exception e2){
        System.out.println(e2);
    }
    }
}
