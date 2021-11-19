package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickelcount = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickelAsInt = Integer.parseInt(nickelcount);
		// Ask the user how many dimes they have, and convert their answer
String dimecount = JOptionPane.showInputDialog("how many dimes do you have?");
int dimeAsInt = Integer.parseInt(dimecount);
		// Ask the user how many quarters they have, and convert their answer
String quartercount = JOptionPane.showInputDialog("How many quarters do you have?");
int quarterAsInt = Integer.parseInt(quartercount);
		// Calculate how much money the user has.  Hint: Use a double variable 
double nickelmoney = nickelAsInt*0.05;
double dimemoney = dimeAsInt*0.10;
double quartermoney = quarterAsInt*0.25;
double totalmoney = nickelmoney+dimemoney+quartermoney;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null," Your balance is $"+totalmoney );
	}
}

