package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend = false;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if (day.equalsIgnoreCase("monday")) {
			 isWeekend=false;
		} else if (day.equalsIgnoreCase("tuesday")) {
			 isWeekend=false;
		} else if (day.equalsIgnoreCase("wednesday")) {
			 isWeekend=false;
		} else if (day.equalsIgnoreCase("thursday")) {
			 isWeekend=false;
		} else if (day.equalsIgnoreCase("friday")) {
			 isWeekend=false;
		} else if (day.equalsIgnoreCase("saturday")) {
			 isWeekend=true;
		} else if (day.equalsIgnoreCase("sunday")) {
			 isWeekend=true;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend==false) {
			JOptionPane.showMessageDialog(null, "GET OUT OF BED AND GO TO SCHOOL, SLEEPYHEAD!!!");
		}else if (isWeekend==true) {
			JOptionPane.showMessageDialog(null, "You should go get your SLEEP in.");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!

		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String score = JOptionPane.showInputDialog("What percentage did you score on your last exam?");
		int scoreasint = Integer.parseInt(score);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if (scoreasint>70) {
			passedExam=true;
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS!!!");
		} else {
		JOptionPane.showMessageDialog(null, "BETTER LUCK NEXT TIME!!!");
		}
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is the game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		} JOptionPane.showMessageDialog(null, "game is over.");
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String colorchoose = JOptionPane.showInputDialog("what color should I draw with?");
		if (colorchoose.equalsIgnoreCase("red")){
			isRed=true;
		} else {
		isRed=false;
			}
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shapechoose = JOptionPane.showInputDialog("what shape should I draw?");
		if (shapechoose.equalsIgnoreCase("square") && colorchoose.equalsIgnoreCase("red")) {
			drawRedSquare();
		} else {
		JOptionPane.showMessageDialog(null, "Sorry. I don't know how to draw that shape.");
		}
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape


	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(Color.RED);
		rob.move(75);
		rob.turn(90);
		rob.move(75);
		rob.turn(90);
		rob.move(75);
		rob.turn(90);
		rob.move(75);
		rob.turn(90);
		rob.hide();
	}	
}
