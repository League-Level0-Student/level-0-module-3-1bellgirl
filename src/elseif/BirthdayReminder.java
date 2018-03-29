
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 14th";
		String dadsBirthday = "January 24th";
		String myBirthday = "May 31st";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String reminder= JOptionPane.showInputDialog("Which birthday do you want to be reminded of?");
		// 3. Print out what the user typed
		// 4. if user asked for "mom"
			//print mom's birthday
		if(reminder.equals("mom")) {
			JOptionPane.showMessageDialog(null, "November 14");
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(reminder.equals("dad")) {
			JOptionPane.showMessageDialog(null, "January 24th");
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (reminder.equals("maclaryn")){
			JOptionPane.showMessageDialog(null, "May 31st");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	} 
}
