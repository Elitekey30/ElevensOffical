package elevens;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void testCard() {
		Card card = new Card ("Queen", "Hearts", 12);
		assertNotNull(card);
	}

	@Test
	public void testSuitQueenHearts() {
		String suit = "Hearts";
		Card card = new Card ("Queen", suit, 12);
		assertEquals(suit, card.suit());
	}
	
	@Test
	public void testSuitJackSpades() {
		String suit = "Spades";
		Card card = new Card ("Jack", suit, 11);
		assertEquals(suit, card.suit());
	}

	@Test
	public void testRank() {
		String rank = "Jack";
		Card card = new Card (rank, "Spades", 11);
		assertEquals(rank, card.rank());
	}

	@Test
	public void testPointValue() {
		int pointValue = 11;
		Card card = new Card ("Jack", "Spades", 11);
		assertEquals(pointValue, card.pointValue());
	}

	@Test
	public void testMatches() {
		Card card = new Card ("Jack", "Spades", 11);
		Card otherCard = new Card ("Jack", "Spades", 11);
		assertTrue(card.matches(otherCard));
	}
	@Test
	public void testDoesNotMatch() {
		Card card = new Card ("Jack", "Heart", 11);
		Card otherCard = new Card ("Jack", "Spades", 11);
		assertFalse(card.matches(otherCard));
	}

	@Test
	public void testToString() {
		Card card = new Card ("Jack", "Spades", 11);
		String outputString = "Jack of Spades (pointValue = 11)";
		assertEquals(outputString, card.toString());
	}

}
