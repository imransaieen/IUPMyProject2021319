
public class HotelKeeperFacade {
	   
	   private Hotel nonVeg;
	   private Hotel asian;


	   public HotelKeeperFacade() {
		   nonVeg = new NonVegRestaurant();
		   asian = new AsianRestaurant();
	     
	   }

	   public void getNonVegMenu(){
		   nonVeg.getMenus();
	   }
	   public void getAsianMenu(){
		   asian.getMenus();
	   }
	   
	   public void getBothMenus(){
		   getNonVegMenu();
		   getAsianMenu();
	   }
	   
	}
