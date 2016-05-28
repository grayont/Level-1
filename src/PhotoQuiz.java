

	 // Copyright Wintriss Technical Schools 2013
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

			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String image = "http://a.abcnews.go.com/images/Entertainment/NC_the_goonies_jef_150604_12x5_1600.jpg";
			// 2. create a variable of type "Component" that will hold your image
Component Image1;
			// 3. use the "createImage()" method below to initialize your Component
Image1 = createImage(image);
			// 4. add the image to the quiz window
quizWindow.add(Image1);

			// 5. call the pack() method on the quiz window
quizWindow.pack();

			// 6. ask a question that relates to the image
String answer1 = JOptionPane.showInputDialog("What movie is this image from?");

			// 7. print "CORRECT" if the user gave the right answer
if(answer1.equalsIgnoreCase("The goonies")){
	JOptionPane.showMessageDialog(quizWindow, "Correct!");
}

			// 8. print "INCORRECT" if the answer is wrong
else{
	JOptionPane.showMessageDialog(quizWindow, "Incorrect!");
}

			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(Image1);

			// 10. find another image and create it (might take more than one line of code)
String image2 = "http://graphics8.nytimes.com/images/2008/01/21/science/castaway533.jpg";
Component Image2 = createImage(image2);

			// 11. add the second image to the quiz window
quizWindow.add(Image2);


			// 12. pack the quiz window
quizWindow.pack();

			// 13. ask another question
String answer2 = JOptionPane.showInputDialog("What movie is this from?");

			// 14+ check answer, say if correct or incorrect, etc.
if(answer2.equalsIgnoreCase("Castaway")){
	JOptionPane.showMessageDialog(quizWindow, "Correct!");
}
else{
	JOptionPane.showMessageDialog(quizWindow, "Incorrect!");
}

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



