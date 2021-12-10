package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String onenum = JOptionPane.showInputDialog("Give me a number please!");
String twonum = JOptionPane.showInputDialog("Give me a number please!");
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Operation", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" },
				null);
		int oneasint = Integer.parseInt(onenum);
		int twoasint = Integer.parseInt(twonum);
		int oneasint1 = Integer.parseInt(onenum);
		int twoasint1 = Integer.parseInt(twonum);
			//	
		int oneasint2 = Integer.parseInt(onenum);
		int twoasint2 = Integer.parseInt(twonum);
			//	
		int oneasint3 = Integer.parseInt(onenum);
		int twoasint3 = Integer.parseInt(twonum);
		if (operation==3) {
	add(oneasint, twoasint);
}
		if (operation==2) {
			subtract(oneasint, twoasint);
}
		if (operation==1) {
			multiply(oneasint, twoasint);
}
		if (operation==0) {
			divide(oneasint, twoasint);
}
	// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

	//	
		///////////////
		
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int onenum, int twonum) {
		int solution = onenum+twonum;
		JOptionPane.showMessageDialog(null, onenum+ " + " +twonum + " = " +solution);
	}
		// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int onenum1, int twonum1) {
		int solution1 = onenum1-twonum1;
		JOptionPane.showMessageDialog(null, onenum1+ " - " +twonum1+ " = " +solution1);
	}
	static void multiply(int onenum2, int twonum2) {
		int solution2 = onenum2*twonum2;
		JOptionPane.showMessageDialog(null, onenum2+ " * " +twonum2 + " = " +solution2);
	}
	static void divide(int onenum3, int twonum3) {
		int solution3 = onenum3/twonum3;
		JOptionPane.showMessageDialog(null, onenum3+ " / " +twonum3 + " = " +solution3);
		}
}