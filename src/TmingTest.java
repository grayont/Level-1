import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class TmingTest {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		words.add("Bog");
		words.add("Log");
		words.add("Frog");
		words.add("Trog");
		words.add("Dog");
		words.add("Grog");
		words.add("Blog");
		words.add("Smog");
		words.add("Prolog");
		words.add("Cat");
		long startTime = System.currentTimeMillis();
		
	

		for (String current : words) {
			
			
			while (!current.equals(JOptionPane.showInputDialog("Type " + current))) {
				
				
			}
			

		}
		long endTime = System.currentTimeMillis();
		
		JOptionPane.showMessageDialog(null, "It took you " + ((endTime - startTime)/1000) + " seconds.");

	}

}
