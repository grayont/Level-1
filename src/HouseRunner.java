import java.awt.Color;
import java.util.Random;

public class HouseRunner {

public static void main(String[] args) {
	HouseCreator creator = new HouseCreator();
	creator.putInLeftCorner();
	for (int i = 0; i < 40; i++) {
		creator.drawHouse(new Random().nextInt(600) + 100, Color.green);
	}
	
}

}
