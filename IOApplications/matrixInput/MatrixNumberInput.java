package matrixInput;
import java.io.*;
import java.util.*;
public class MatrixNumberInput {
	

	

		public static void matrixProcessing(String filename) throws IOException {
			File file = new File(filename);

			Scanner fout = new Scanner(file);
			int n;

			if (fout.hasNextInt()) {
				n = Integer.parseInt(fout.next());
			} else {
				fout.close();
				throw new NumberFormatException(
						"The first number has to be of integer value!\n");

			}

			double[][] mat = new double[n][n];

			int i = 0, j = 0;

			while (fout.hasNextLine() && i < n) {
				if (i < n) {
					j = 0;
					while (fout.hasNext() && j < mat[i].length) {

						if (fout.hasNextDouble()) {
							if (j < mat[i].length) {

								mat[i][j] = fout.nextDouble();
								j++;
								
							}
						} else {
							fout.next();
						}

					}

				}
				i++;
			}
			
			for (int k = 0; k < n; k++) {       /* If the contained numbers in the file are not enough for
			                                     *  all matrix elements, also if we do not wish default values 
			                                     *  close to value 0.0,
			                                     * assign a certain default value. In this case default value 1.0 
			                                     */
				for (int l = 0; l < n; l++) {

					if (mat[k][l]>-0.0001 && mat[k][l]<0.0001) {
						mat[k][l] = 1.0;
					}
				}
			}

			fout.close();

			for (int k = 0; k < n; k++) {             /* Output of the two dimensional array (matrix) */
				for (int l = 0; l < n; l++) {
					System.out.print(mat[k][l]+"\t");
				}
				System.out.println();
			}

		}
	

}
