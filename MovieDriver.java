
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		boolean intent = true;
		String yesno;
		
		Scanner kbd = new Scanner(System.in);
		
		Movie mymovie = new Movie();
		
		while (intent == true) {
		
		System.out.print("Enter the title of the movie ");
		mymovie.setTitle(kbd.nextLine());
		System.out.print("Enter the rating of the movie ");
		mymovie.setRating(kbd.nextLine());
		System.out.print("Enter the number of tickets sold ");
		mymovie.setSoldTickets(kbd.nextInt());
		kbd.nextLine();
		System.out.println(mymovie.toString());
		
		System.out.println("Do you want to enter another? yes/no" );
		yesno = kbd.nextLine();
		if (yesno.equals("no")) break;
		}
	}

	}

