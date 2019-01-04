package ru.rzn.sbt.javaschool.lesson3.musician;

public class FrontMan extends Musician {
    private int row;
    private static String[] rows = new String[] {
            "C# G# F#",
            "C# G# F#",
            "Em E A5 C",
            "Em G Em G",
    };
    private int rowSing;
    private static String[] rowsSing = new String[] {
            "Take advantage while",
            "You hang me out to dry",
            "But I can't see you every night",
            "Free I do"
    };
    @Override
    protected String playGuitar() {
        return rows[row++ % 4];
    }

    @Override
    protected String sing() {
        return rowsSing[rowSing++ % 4];
    }
}
