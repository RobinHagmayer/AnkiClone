package dev.hagmayer.ankiclone;

import java.util.ArrayList;

public class UserData {
    private final ArrayList<Deck> decks;

    public UserData() {
        this.decks = new ArrayList<>();
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "decks=" + decks +
                '}';
    }
}
