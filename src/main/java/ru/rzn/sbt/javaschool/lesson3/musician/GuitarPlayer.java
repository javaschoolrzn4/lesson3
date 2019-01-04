package ru.rzn.sbt.javaschool.lesson3.musician;

public class GuitarPlayer extends Musician {
    private int row;
    private static String[] rows = new String[] {
            "C G Dm G",
            "C G",
            "Dm G Am",
            "Am/F G"
    };
    @Override
    protected String playGuitar() {
        return rows[row++ % 4];
    }

    @Override
    protected String sing() {
        return null;
    }
}
