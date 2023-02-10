// second problem
import java.util.Scanner;

public  class secondProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an integer number");
        int number = sc.nextInt();
        
   if(number < 0){
        System.out.println("Number too small");
    }else if(number > 32767){
        {
            System.out.println("Number too large");
        }
    }else if(number %2 == 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
        
        
    }
}
