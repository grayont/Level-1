
public class Netflix {
	public static void main(String[] args) {
		//1. Instantiate some Movie objects (at least 5).
		//2. Use the Movie class to get the ticket price of one of your movies.


		//3. Instantiate a NetflixQueue.
		//4. Add your movies to the Netflix queue.
		//5. Print all the movies in your queue.
		
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
		Movie Goonies = new Movie("The Goonies", 5);
		Movie FoodFight = new Movie("Food Fight", 1);
		Movie Pixels = new Movie("Pixel", 2);
		Movie Incredibles = new Movie("The Incredibles", 4);
		Movie Doawk = new Movie("Diary of a Wimpy Kid", 3);
		
		Goonies.getTicketPrice();
		NetflixQueue Q = new NetflixQueue();
		Q.addMovie(Goonies);
		Q.addMovie(FoodFight);
		Q.addMovie(Pixels);
		Q.addMovie(Incredibles);
		Q.addMovie(Doawk);
	}
	

}
