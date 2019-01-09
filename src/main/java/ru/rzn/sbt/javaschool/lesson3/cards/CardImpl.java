package ru.rzn.sbt.javaschool.lesson3.cards;

public class CardImpl implements Card {
    private int suit;
    private int rank;

    public CardImpl(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return Rank.values()[rank].getRankName() + " " + Suite.values()[suit].getSuitName();
    }

    enum Rank {
        ACE(0, "туз"),
        SIX(1, "шестёрка"),
        SEVEN(2, "семёрка"),
        EIGHT(3, "восьмёрка"),
        NINE(4, "девятка"),
        TEN(5, "десятка"),
        JACK(6, "валет"),
        QUEEN(7, "дама"),
        KING(8, "король");

        private int rankId;
        private String rankName;

        Rank(int rankId, String rankName) {
            this.rankId = rankId;
            this.rankName = rankName;
        }

        public String getRankName() {
            return rankName;
        }
    }

    enum Suite {
        DIAMONDS(0, "бубны"),
        CLUBS(1, "трефы"),
        HEARTS(2, "червы"),
        SPADES(3, "пики");

        private int suitID;
        private String suitName;

        Suite(int suitID, String suitName) {
            this.suitID = suitID;
            this.suitName = suitName;
        }

        public String getSuitName() {
            return this.suitName;
        }
    }
}
