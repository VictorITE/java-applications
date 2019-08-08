package input;

import java.util.*;
import java.io.*;

public class Test {
	
	/* Class for different types of file reading */
	
	public static void readLines(String filename) throws IOException {

		File file = new File(filename);

		Scanner fin = new Scanner(file);

		while (fin.hasNextLine()) {              /* Print the file content, line length not considered*/
			System.out.println(fin.nextLine());
		}

		fin.close();
	}

	public static void readLines50(String filename) throws IOException {

		File file = new File(filename);

		Scanner fin = new Scanner(file);

		while (fin.hasNextLine()) {

			String line = fin.nextLine();
			if (line.length() <= 50) { /* Print content if the length of a line is smaller than 150 units.*/
				System.out.println(line);
			}
		}

		fin.close();
	}

	public static void main(String[] args) throws IOException {
		
		System.out.println("with readLines:");
		
		String filename = "test1.txt";            /* The file is given a certain name. */
		
		readLines(filename);
		
		System.out.println("_________________________");        /* A line to separate the two outputs  */
		
		System.out.println("with readLines50:");
		
		readLines50(filename);
	}

}
