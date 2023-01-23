public class Card implements Comparable<Card> {

    public enum Suit {
        Diamonds, Spades, Hearts, Clubs
    }

    public enum Rank {
        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
    }

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }


    @Override
    public int compareTo(Card other) {
        if (rank == other.rank)
            return suit.compareTo(other.suit);
        return rank.compareTo(other.rank);
    }
}
