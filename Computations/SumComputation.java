import java.util.*;
import java.math.*;

public class SumComputation {

    public static void main(String[] args) {

        Scanner memberInput=new Scanner(System.in);


        int n,x, j=1;

        double s=1.0;

        n=memberInput.nextInt();

        x=memberInput.nextInt();

        for(int i=1;i<=n;i++){
             j*=i;
             s+=j/Math.pow(x,i);
          }

        System.out.printf("%.4f",s);
    }
}
