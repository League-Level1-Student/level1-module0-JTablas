/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	
	
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		
		
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select â€œCopy Image URLâ€�)
		String doggo = "https://static.boredpanda.com/blog/wp-content/uploads/2017/11/This-friendship-between-these-two-dogs-and-this-kitten-will-love-you-5a205d29197e6__880.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component doggos;
		// 3. use the "createImage()" method below to initialize your Component
		doggos = createImage(doggo);
		// 4. add the image to the quiz window
		quizWindow.add(doggos);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question =JOptionPane.showInputDialog("How many dogs are there?");
		System.out.println(question);
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equals("2")){
		JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else{
		JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(doggos);
		// 10. find another image and create it (might take more than one line of code)
		String lettuce = "https://cdn.shopify.com/s/files/1/1003/1822/products/iceberglettuce1024_84897056_2048x2048.jpg?v=1479880606";
		Component letus;
		letus = createImage(lettuce);
		// 11. add the second image to the quiz window
		quizWindow.add(letus);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question2 = JOptionPane.showInputDialog("What is this?");
		System.out.println(question2);
		// 14+ check answer, say if correct or incorrect, etc.
		if(question2.equalsIgnoreCase("Lettuce")){
		JOptionPane.showMessageDialog(null, "You're right.");
		} else{
		JOptionPane.showMessageDialog(null, "Wrong");
		}
		quizWindow.remove(letus);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





