import java.util.*;
import java.io.*;

public class MiddleValue {
/* Find the middle value of all the integers in a file */
	public static double readMiddleValue(String filename) throws IOException {

		File file = new File(filename);

		Scanner fin = new Scanner(file);

		double middlevalue = 0.0;
		int n = 0, others = 0;
		int sum = 0;
		while (fin.hasNextLine()) {
			while (fin.hasNext()) {
				if (fin.hasNextInt()) {
					sum += fin.nextInt();
					n++;
				} else if (fin.hasNextFloat() || fin.hasNextDouble()) {
					System.out.println("No integers found, found float or double values.");
					others++;
					fin.next();
				} else if (fin.nextLine().isEmpty() || (others == 0 && n == 0)) {
					System.out.println("No numbers currently found.");
				}
			}

		}
		fin.close();
		middlevalue = sum / n;                          /*
								 * Compute middle value of all the integers in
								 * the processed file
								 */
		return middlevalue;
	}

	public static void main(String[] arg) throws IOException {

		String filename = "test1.txt";

		try {

			double res = readMiddleValue(filename);

			System.out.println("Middle value:");

			System.out.printf("%f", res);

		} catch (IOException e) {

			System.out.println("An exception occurred.");

			e.printStackTrace();
		}

	}

}
