public class Stand {
	private String farmerName;
	private String standName;
	private int apples;
	private int tomatoes;
	private int melons;
	private int carrots;
	private int broccoli;

//////////////////////Constructor///////////////////////
	
	public Stand(String farmerName, String standName) {
		this.farmerName = farmerName;
		this.standName = standName;
		this.apples = 0;
		this.tomatoes = 0;
		this.melons = 0;
		this.carrots = 0;
		this.broccoli = 0;
	}

//////////////Getters//////////////

	public String getFarmerName() {
		return farmerName;
	}
	
	public String getStandName() {
		return standName;
	}
	
	public int getApples() {
		return apples;
	}
	
	public int getTomatoes() {
		return tomatoes;
	}
	
	public int getMelons() {
		return melons;
	}
	
	public int getCarrots() {
		return carrots;
	}
	
	public int getBroccoli() {
		return broccoli;
	}

///////////////////Setters////////////////////////

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	
	public void setStandName(String standName) {
		this.standName = standName;
	}
	
	public void setApples(int apples) {
		if(apples >= 0)
			this.apples = apples;
	}
	
	public void setTomatoes(int tomatoes) {
		if(tomatoes >= 0)
			this.tomatoes = tomatoes;
	}
	
	public void setMelons(int melons) {
		if(melons >= 0)
			this.melons = melons;
	}
	
	public void setCarrots(int carrots) {
		if(carrots >= 0)
			this.carrots = carrots;
	}
	
	public void setBroccoli(int broccoli) {
		if(broccoli >= 0)
			this.broccoli = broccoli;
	}

	// On correct input, 1 is subtracted from the corresponding 
	// produce and stand if that produce is in stock at that stand.
	public void buyProduce(char ch) {
		if(ch == 'a' || ch == 'A') {
			if(this.getApples() > 0) {
				this.setApples(this.getApples() - 1);
				System.out.println("You bought one apple from " + this.getFarmerName() + ". " + 
					this.getFarmerName() + " now has " + this.getApples() + " apple(s).");
			}
			else
				System.out.println(this.getFarmerName() + " has no apples.");
		}	
		else if(ch == 't' || ch == 'T') {
			if(this.getTomatoes() > 0) {
				this.setTomatoes(this.getTomatoes() - 1);
				System.out.println("You bought one tomato from " + this.getFarmerName() + ". " + 
					this.getFarmerName() + " now has " + this.getApples() + " tomato(es).");
			}
			else
				System.out.println(this.getFarmerName() + " has no tomatoes.");
		}
		else if(ch == 'm' || ch == 'M') {
			if(this.getMelons() > 0) {
				this.setMelons(this.getMelons() - 1);
				System.out.println("You bought one melon from " + this.getFarmerName() + ". " + 
					this.getFarmerName() + " now has " + this.getApples() + " melon(s).");
			}
			else
				System.out.println(this.getFarmerName() + " has no melons.");
		}
		else if(ch == 'c' || ch == 'C') {
			if(this.getCarrots() > 0) {
				this.setCarrots(this.getCarrots() - 1);
				System.out.println("You bought one carrot from " + this.getFarmerName() + ". " + 
					this.getFarmerName() + " now has " + this.getApples() + " carrot(s).");
			}
			else
				System.out.println(this.getFarmerName() + " has no carrots.");
		}
		else if(ch == 'b' || ch == 'B') {
			if(this.getBroccoli() > 0) {
				this.setBroccoli(this.getBroccoli() - 1);
				System.out.println("You bought one broccoli from " + this.getFarmerName() + ". " + 
					this.getFarmerName() + " now has " + this.getApples() + " broccoli.");
			}
			else
				System.out.println(this.getFarmerName() + " has no broccoli.");
		}
		else
			System.out.println(ch + " is not a valid purchase. Try again using a, t, m, c, or b as an argument.");
	}

	// Returns the fields and corresponding values of a stand.
	public String toString() {
		return ("Farmer Name: " + farmerName + "\n" +
				"Stand Name: " + standName + "\n" +
				"Number of Apples: " + apples + "\n" +
				"Number of Tomatoes: " + tomatoes + "\n" +
				"Number of Melons: " + melons + "\n" +
				"Number of Carrots: " + carrots + "\n" +
				"Number of Broccoli: " + broccoli + "\n"
				);
	}
}