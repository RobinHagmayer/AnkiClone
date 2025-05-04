package dev.hagmayer.ankiclone;

import com.fatboyindustrial.gsonjavatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        Gson gson = Converters.registerLocalDate(new GsonBuilder()).create();
        String json = gson.toJson(userData);
        System.out.println(json);
    }
}
