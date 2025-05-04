package dev.hagmayer.ankiclone;

import java.util.ArrayList;

public class AnkiClone {
    public static void main(String[] args) {
        Card card = new Card("World", "Welt");
        System.out.println(card);

        Deck deck = new Deck("Englisch - Deutsch");
        ArrayList<Card> cards = deck.getCards();
        cards.add(card);
        System.out.println(deck);

        UserData userData = new UserData();
        ArrayList<Deck> decks = userData.getDecks();
        decks.add(deck);
        System.out.println(userData);
    }
}
