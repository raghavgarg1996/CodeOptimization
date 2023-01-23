import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CardTest {

    @Test
    public void sameRankAndSuitCardsAreEqual() {
        Card kingOfDiamond = new Card (Card.Rank.King, Card.Suit.Diamonds);
        Card anotherKingOfDiamond = new Card(Card.Rank.King, Card.Suit.Diamonds);
     //   assertEquals(kingOfDiamond, anotherKingOfDiamond);
        assertEquals(0,kingOfDiamond.compareTo(anotherKingOfDiamond));
    }

    @Test
    public void tenOfHeartsBeatsTwoOfHearts() {
        Card tenOfHearts = new Card (Card.Rank.Ten, Card.Suit.Hearts);
        Card twoOfHearts = new Card(Card.Rank.Two, Card.Suit.Hearts);
        assertTrue(tenOfHearts.compareTo(twoOfHearts)>0);
    }

    @Test
    public void clubBeatsHeartsOfSameRank() {
        Card tenOfHearts = new Card(Card.Rank.Ten, Card.Suit.Hearts);
        Card tenOfClubs = new Card(Card.Rank.Ten, Card.Suit.Clubs);
        assertTrue(tenOfClubs.compareTo(tenOfHearts)>0);

    }
}
