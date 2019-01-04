package ru.rzn.sbt.javaschool.lesson3.cards;

public class DeckImpl implements Deck {
    private CardImpl[][] cards = new CardImpl[CardImpl.Suite.values().length][CardImpl.Rank.values().length];

    public DeckImpl() {
        for (int suite = 0; suite < CardImpl.Suite.values().length; ++suite)
            for (int rank = 0; rank < CardImpl.Rank.values().length; ++rank)
                cards[suite][rank] = new CardImpl(suite, rank);
    }

    @Override
    public Card getCard(int suit, int rank) {
        return this.cards[suit][rank];
    }

}
