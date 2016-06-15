import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/Trump.jpg";
	String secondImage = "/Users/league/Desktop/Danny.jpg";
	String thirdImage = "/Users/league/Desktop/Snoop.jpg";

	Frame window = new Frame();
	
	@SuppressWarnings("deprecation")
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(1000, 1000);
			
		// Make an int variable to hold the score.
int score = 0;
		// Ask the user who this person is and store their answer
String answer1 = JOptionPane.showInputDialog("Who is this person?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if(answer1.equalsIgnoreCase("Donald Trump")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1;
}

else{
	JOptionPane.showMessageDialog(null, "Wrong.");
}


JOptionPane.showMessageDialog(null, "You have " + score + " point(s).");

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
showNextImage();
window.setSize(1000, 300);

String answer2 = JOptionPane.showInputDialog("Who is this person?");

if(answer2.equalsIgnoreCase("Danny Devito")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1;
}

else{
	JOptionPane.showMessageDialog(null, "Wrong.");
}

JOptionPane.showMessageDialog(null, "You have " + score + " point(s).");

showNextImage();
window.setSize(500, 500);

String answer3 = JOptionPane.showInputDialog("Who is this person?");

if(answer3.equalsIgnoreCase("Snoop dogg")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1;
}

else{
	JOptionPane.showMessageDialog(null, "Wrong.");
}

JOptionPane.showMessageDialog(null, "You scored " + score + " out of 3 points!");

	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
