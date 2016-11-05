import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

	public static void main(String[] args) {
		World world = new World();
		Location loc = new Location(2, 4);
		Location loc2 = new Location(9, 5);
		world.show();
		Bug bug1 = new Bug();
		Flower flower1 = new Flower();
		world.add(loc, bug1);
		world.add(loc2, flower1);

	}

}
