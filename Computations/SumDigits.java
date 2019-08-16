import java.util.*;

public class SumDigits {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int s=scanner.nextInt();

        if(s>=1000 && s<=9999) {

            int d = s % 10;

            System.out.println(d);

            int c = ((s - d) % 100) / 10;

            System.out.println(c);

            int b = ((s - c) % 1000) / 100;

            System.out.println(b);

            int a = ((s - b) % 10000) / 1000;

            System.out.println(a);

            int res = d + c + b + a;

            System.out.printf("%d", res);

        }else{
           
            System.put.println("Number has to be a 4-digit number.");
        }

     }
}
