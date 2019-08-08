import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calculator extends Applet {

	String arg1 = "", /* The values of the arguments are processed as Strings */
	arg2 = "";
	String result;
	Button number[] = new Button[10];
	Button function[] = new Button[4];
	Button execute;
	Panel numberPanel, functionPanel, resultPanel;
	Button decimalPoint;
	TextField resultField;
	int operationArgument; /* 1 is first argument 2 is second argument */
	char operation;

	public void init() {
		operationArgument = 1;
		operation = ' ';

		setLayout(new BorderLayout());

		numberPanel = new Panel();
		numberPanel.setLayout(new GridLayout(4, 3));
		for (int i = 9; i >= 0; i--) {
			number[i] = new Button(String.valueOf(i));
			number[i].addActionListener(new NumbersButton());
			numberPanel.add(number[i]);
		}

		decimalPoint = new Button(".");

		decimalPoint.addActionListener(new NumbersButton());

		numberPanel.add(decimalPoint); /* adding to the panel */

		execute = new Button("=");/* new button */

		execute.addActionListener(new ExecuteButton()); /*
														 * adding the button to
														 * the Listener
														 */
		numberPanel.add(execute); /* adding the to the panel */

		add("Center", numberPanel);

		functionPanel = new Panel();
		functionPanel.setLayout(new GridLayout(4, 1));

		function[0] = new Button("+");
		function[0].addActionListener(new OperationButton());
		functionPanel.add(function[0]);
		function[1] = new Button("-");
		function[1].addActionListener(new OperationButton());
		functionPanel.add(function[1]);

		function[2] = new Button("*");
		function[2].addActionListener(new OperationButton());
		functionPanel.add(function[2]);
		function[3] = new Button("/");
		function[3].addActionListener(new OperationButton());
		functionPanel.add(function[3]);

		add("East", functionPanel);
		resultPanel = new Panel();
		resultField = new TextField("0", 15);
		resultPanel.add(resultField);
		add("North", resultPanel);

	}

	class NumbersButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			switch (operationArgument) {
			case (1): {
				if (!arg1.contains(".")) {
					arg1 += e.getActionCommand(); /*
												 * return the String identifying
												 * the command for this event
												 */
				} else {
					if (!e.getActionCommand().equals(".")) {
						arg1 += e.getActionCommand();
					}
				}

				resultField.setText(arg1); /* put on the text field */

				break;
			}
			case (2): {
				if (!arg2.contains(".")) {
					arg2 += e.getActionCommand();
				} else {
					if (!e.getActionCommand().equals(".")) {
						arg1 += e.getActionCommand();
					}
				}

				resultField.setText(arg2);

				break;
			}

			default: {

			}
			}
		}
	}

	class OperationButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("+")) {

				operation = '+';

				operationArgument = 2;

			} else if (e.getActionCommand().equals("-")) {
				operation = '-';

				operationArgument = 2;
			} else if (e.getActionCommand().equals("*")) {
				operation = '*';

				operationArgument = 2;
			} else if (e.getActionCommand().equals("/")) {
				operation = '/';

				operationArgument = 2;

			} else if (e.getActionCommand().equals("=")) {
				operation = '=';

				operationArgument = 1;

			}
		}

		public void paint(Graphics g) {

		}
	}

	class ExecuteButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (operation == '+') {
				if (arg1.contains(".") || arg2.contains(".")) {
					result = String.valueOf((new Double(arg1)).doubleValue()
							+ (new Double(arg2)).doubleValue());
				} else {
					result = String.valueOf((new Integer(arg1)).intValue()
							+ (new Integer(arg2)).intValue());
				}

			} else if (operation == '-') {
				if (arg1.contains(".") || arg2.contains(".")) {
					result = String.valueOf((new Double(arg1)).doubleValue()
							- (new Double(arg2)).doubleValue());
				} else {
					result = String.valueOf((new Integer(arg1)).intValue()
							- (new Integer(arg2)).intValue());
				}
			} else if (operation == '*') {
				result = String.valueOf((new Double(arg1)).doubleValue()
						* (new Double(arg2)).doubleValue());
			} else if (operation == '/') {
				if (Double.parseDouble(arg2) == 0) {
					arg2 = "";
					throw new ArithmeticException("Divisor cannot be zero.");

				}
				result = String.valueOf((new Double(arg1)).doubleValue()
						/ (new Double(arg2)).doubleValue());

			}

			resultField.setText(result + "");
			arg1 = "";
			arg2 = "";
			operationArgument = 1;

		}
	}

}
