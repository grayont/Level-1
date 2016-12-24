


import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot bot;
	public static void main(String[] args) {
		bot = new Robot();
		bot.penUp();
		bot.setX(0);
		bot.setY(920);
		
		bot.penDown();
		bot.setSpeed(10);
		for (int i = 0; i < 10; i++){
		
		drawFlatHouse(new Random().nextInt(600) + 100, Color.gray);
		drawPointHouse(new Random().nextInt(600) + 100, Color.blue);
		}
		
	}
	public static void drawFlatHouse(int height, Color color){
		bot.turn(90);
		bot.setPenColor(Color.green);
		bot.move(100);
		bot.setPenColor(color);
		bot.turn(-90);
		bot.move(height);
		bot.turn(90);
		bot.move(70);
		bot.turn(90);
		bot.move(height);
		bot.turn(-180);
	}
	public static void drawPointHouse(int height, Color color){
		bot.turn(90);
		bot.setPenColor(Color.green);
		bot.move(100);
		bot.setPenColor(color);
		bot.turn(-90);
		bot.move(height);
		bot.turn(45);
		bot.move(50);
		bot.turn(90);
		bot.move(50);
		bot.turn(45);
		bot.move(height);
		bot.turn(-180);
		
	}

}
