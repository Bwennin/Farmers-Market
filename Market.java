public class Market {
	private Stand[] FarmersMarket = new Stand[0];

	// Constructor makes variable number of stands provided by user in main.
	public Market(int numStands) {
		FarmersMarket = new Stand[numStands];
		for(int i = 0; i < numStands; i++)
			FarmersMarket[i] = new Stand(("Farmer " + i), ("Stand " + i));
	}

	public Stand[] getFarmersMarket() {
		return FarmersMarket;
	}

	// Prints a list of farmers and corresponding stands that have the fruit requested by the user.
	public void findProduce(char ch) {
		boolean flag = false;
		if(ch == 'a' || ch == 'A') {
			for(int i = 0; i < FarmersMarket.length; i++) {
				if(FarmersMarket[i].getApples() > 0) {
					System.out.println(FarmersMarket[i].getFarmerName() + " has apples at " + FarmersMarket[i].getStandName() + ".");
					flag = true;
				}
			}
		}
		else if(ch == 't' || ch == 'T') {
			for(int i = 0; i < FarmersMarket.length; i++) {
				if(FarmersMarket[i].getTomatoes() > 0) {
					System.out.println(FarmersMarket[i].getFarmerName() + " has tomatoes at " + FarmersMarket[i].getStandName() + ".");
					flag = true;
				}
			}
		}
		else if(ch == 'm' || ch == 'M') {
			for(int i = 0; i < FarmersMarket.length; i++) {
				if(FarmersMarket[i].getMelons() > 0) {
					System.out.println(FarmersMarket[i].getFarmerName() + " has melons at " + FarmersMarket[i].getStandName() + ".");
					flag = true;
				}
			}
		}
		else if(ch == 'c' || ch == 'C') {
			for(int i = 0; i < FarmersMarket.length; i++) {
				if(FarmersMarket[i].getCarrots() > 0) {
					System.out.println(FarmersMarket[i].getFarmerName() + " has carrots at " + FarmersMarket[i].getStandName() + ".");
					flag = true;
				}
			}
		}
		else if(ch == 'b' || ch == 'B') {
			for(int i = 0; i < FarmersMarket.length; i++) {
				if(FarmersMarket[i].getBroccoli() > 0) {
					System.out.println(FarmersMarket[i].getFarmerName() + " has broccoli at " + FarmersMarket[i].getStandName() + ".");
					flag = true;
				}
			}
		}
		else {
			System.out.println("Invalid produce. Try again using a, t, m, c, or b as an argument.");
			return;
		}
		
		if(!flag)
			System.out.println("No farmers have this item.");
	}

	// Prints each stand object with Stand's toString() method.
	public void printMarket() {
		for(int i = 0; i < FarmersMarket.length; i++)
			System.out.println(FarmersMarket[i].toString());
	}
}