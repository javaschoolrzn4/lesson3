package ru.rzn.sbt.javaschool.lesson3.musician;

public class Vocalist extends Musician {
    private int row;
    private static String[] rows = new String[] {
            "Take me to the magic of the moment",
            "on a glory night",
            "Where the children of tomorrow dream away",
            "In the Wind of Change"
    };
    @Override
    protected String playGuitar() {
        return null;
    }

    @Override
    protected String sing() {
        return rows[row++ % 4];
    }
}
