package dev.hagmayer.ankiclone;

import java.util.ArrayList;

public class Deck {
    private final String name;
    private final ArrayList<Card> cards;

    public Deck(String name) {
        this.name = name;
        cards = new ArrayList<>(10);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "name='" + name + '\'' +
                ", cards=" + cards +
                '}';
    }
}
