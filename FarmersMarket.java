public class FarmersMarket {
	public static void main(String[] args) {
		
		Market testMarket = new Market(2);
		System.out.println("Market declared with stand objects:");
		testMarket.printMarket();
		
		// Assigning values by accessing stand objects.
		testMarket.getFarmersMarket()[0].setFarmerName("Farmer Bwennin");
		testMarket.getFarmersMarket()[0].setStandName("Bwennin's Produce");
		testMarket.getFarmersMarket()[0].setApples(1);
		testMarket.getFarmersMarket()[0].setMelons(5);
		testMarket.getFarmersMarket()[0].setBroccoli(3);
		testMarket.getFarmersMarket()[1].setApples(2);
		testMarket.getFarmersMarket()[1].setCarrots(1);
		testMarket.getFarmersMarket()[1].setCarrots(-1); // Invalid input, does nothing.
		System.out.println("Market with updated fields:");
		testMarket.printMarket();
		
		// Finding and buying produce.
		System.out.println("Output of findProduce():");
		testMarket.findProduce('q'); // Invalid input.
		testMarket.findProduce('t'); // No farmers have tomatoes.
		testMarket.findProduce('a');
		System.out.println();
		
		System.out.println("Output of buyProduce():");
		testMarket.getFarmersMarket()[0].buyProduce('q'); // Invalid input.
		testMarket.getFarmersMarket()[0].buyProduce('c'); // No farmers have carrots.
		testMarket.getFarmersMarket()[0].buyProduce('A');
		testMarket.getFarmersMarket()[1].buyProduce('a');
		System.out.println();
		
		System.out.println("Market after buying produce:");
		testMarket.printMarket();
	}
}