package input;

import java.util.*;
import java.io.*;

public class FileIOStream {

	public static void testWrite() throws IOException {

		FileWriter fstream = new FileWriter("out.txt");
		BufferedWriter out = new BufferedWriter(fstream);

		out.write("Sample text for file input."+System.lineSeparator());
		out.write("The text will be written in a new generated file.");

		out.close();
	}

	public static void main(String[] args) throws IOException {
		
		System.out.println("testWrite: ");

		testWrite();

		try {
			Test.readLines("out.txt");    /* Read file content from file out.txt. We are using the method readLines(), the class Test */
		} catch (IOException e) {         /* Catch possible related IO exceptions */
			e.printStackTrace();
		}
	}
}
