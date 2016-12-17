import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;
	
	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.run();
		
		
	}
	
	void run(){
	
    
	
		frame.setSize(500, 300);
		frame.setTitle("Type or don't, I don't care");
		frame.setVisible(true);
		frame.add(label);
		frame.addKeyListener(this);
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(200.0f));
		label.setHorizontalAlignment(label.CENTER);
		
		
	}
	
	char generateRandomLetter(){
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("You typed: " + e.getKeyChar());
		if(e.getKeyChar() == currentLetter){
			System.out.println("Corrct");
			frame.getContentPane().setBackground(Color.GREEN);
			
		}
		else{
			System.out.println("Incorrct");
			frame.getContentPane().setBackground(Color.RED);
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		
		
		// TODO Auto-generated method stub
		
	}
	

}
