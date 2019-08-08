package input;

import java.util.*;
import java.io.*;

public class NumberReader {
	/* java class with a here method to fund the sum of intgers in a given file. */
	public static void readLinesInt(String filename) throws IOException {

		File file = new File(filename);

		Scanner fin = new Scanner(file);

		int sum = 0;
		while (fin.hasNextLine()) {
			while (fin.hasNext()) {
				if (fin.hasNextInt())
					sum += fin.nextInt();

				else
					fin.next();
			}
		}
		fin.close();
		System.out.println("sum=" + sum);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("with readLinesInt:");
		String filename = "test1.txt";
		try {
			readLinesInt(filename);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
