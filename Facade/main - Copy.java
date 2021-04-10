import java.util.Scanner;

public class main {
	   public static void main(String[] args) {
		   
		   HotelKeeperFacade restaurants = new HotelKeeperFacade();

		   Scanner in = new Scanner (System.in);
		   
		   System.out.println("What ---do you like to have? Non Veg or Asian or both?");
		   System.out.println("Press 1 for Non Veg, 2 for Asian and 3 for both.");
		   
		   int choice = in.nextInt();
		   
		   
		   if(choice == 1)
		     restaurants.getNonVegMenu();
		   else if(choice == 2)
		     restaurants.getAsianMenu();
		   else
			 restaurants.getBothMenus();
	      
	   }
	}