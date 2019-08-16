import java.util.*;

public class SumPositive {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        
        if(n>0){
              
           double res=n*(n+1)/2;

           System.out.printf("%.0f",res);
        }

        else{

           System.out.println("Input number n has to be a positive value.");

        }
    }

}


