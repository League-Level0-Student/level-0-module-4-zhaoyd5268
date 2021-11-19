package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	String testscore = JOptionPane.showInputDialog("What was your test score?");
     double scoreasint = Double.parseDouble(testscore);
	if (scoreasint<=70) {
		JOptionPane.showMessageDialog(null, "You probably didn't study for your test!");
	} else if (scoreasint>=80 && scoreasint<90) {
		JOptionPane.showMessageDialog(null, "Good job, but it could be better.");
	} else if (scoreasint<=100 && scoreasint>=91) {
		JOptionPane.showMessageDialog(null, "EXELLENTEE!");
	}
}
}
