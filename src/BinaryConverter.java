import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public JButton convert = new JButton();
	JTextField input = new JTextField(20);
	JTextField answer = new JTextField(20);
	
	
	public static void main(String[] args) {
		BinaryConverter converter = new BinaryConverter();
		converter.run();
		
		
		
	}
		 String convert(String binary) {
		   	 int asciiValue = Integer.parseInt(binary, 2);
		   	 char theLetter = (char) asciiValue;
		   	 return "" + theLetter;
		    }
		 
		 void run(){
			 JFrame frame = new JFrame();
				frame.setSize(500, 500);
				frame.setVisible(true);
				
				JPanel panel = new JPanel();
				frame.add(panel);
				
				
				convert.addActionListener(this);
				convert.setText("Convert");
				
				answer.setEnabled(false);
				panel.add(input);
				panel.add(convert);
				panel.add(answer);
				frame.pack();
				
				
				
			 
			 
		 }
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton buttonpressed = (JButton) e.getSource();
			if(buttonpressed == convert){
				 answer.setText(convert(input.getText()));
				
			}
			// TODO Auto-generated method stub
			
		}
	

}
