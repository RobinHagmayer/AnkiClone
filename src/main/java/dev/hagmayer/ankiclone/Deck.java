package dev.hagmayer.ankiclone;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(name, deck.name) && Objects.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cards);
    }
}
