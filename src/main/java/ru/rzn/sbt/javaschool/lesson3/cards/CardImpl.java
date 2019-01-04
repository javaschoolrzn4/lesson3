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
        return Rank.values()[rank].name() + " " + Suite.values()[suit].name();
    }

    enum Rank {
        туз, шестёрка, семёрка, восьмёрка, девятка, десятка, валет, дама, король
    }

    enum Suite {
        бубны,
        трефы,
        червы,
        пики
    }
}
