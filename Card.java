public class Card {

	private int suit;
	private int number;

	public static final int SPADES = 0;
	public static final int CLUBS = 1;
	public static final int DIAMONDS = 2;
	public static final int HEARTS = 3;

	// setSuit takes as input an int and sets the suit accordingly
	// This method takes as input an int and assigns this.suit
	// to be equal to the value of the parameter newSuit.
	public void setSuit(int newSuit) {
		if (newSuit >= 0 && newSuit <= 3) {
			this.suit = newSuit;
		}
	}

	public int getSuit() {
		return this.suit;
	}

	public void setNumber(int newNumber) {
		this.number = newNumber;
	}

	public int getNumber() {
		return this.number;
	}

	public void setSuitFromString(String suit) {
		if (suit.equals("SPADES")) {
			this.suit = Card.SPADES;
		} else if (suit.equals("CLUBS")) {
			this.suit = Card.CLUBS;
		} else if (suit.equals("DIAMONDS")) {
			this.suit = Card.DIAMONDS;
		} else if (suit.equals("HEARTS")) {
			this.suit = Card.HEARTS;
		} else {
			System.out.println("Illegal suit!");
		}
	}

	public String getSuitAsString() {

		if (this.suit == Card.SPADES) {
			return "SPADES";
		} else if (this.suit == Card.CLUBS) {
			return "CLUBS";
		} else if (this.suit == Card.HEARTS) {
			return "DIAMONDS";
		} else {
			return "HEARTS";
		}
	}
}