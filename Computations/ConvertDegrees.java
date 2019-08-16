import java.util.*;

public class DegreesConverter {

    public static void main(String[] args){

        Scanner degrees=new Scanner(System.in);

        String[] enteredData=degrees.nextLine().split(" ");


        for(String j: enteredData){

            double tempFahr=(Integer.parseInt(j)*9/5)+32;

            System.out.printf("%.0f\n",tempFahr);

        }
        
        for (int i = 0; i < enteredData.length; i++) {

            System.out.printf("%.0s\n",enteredData[i]);

        }
    }
}
