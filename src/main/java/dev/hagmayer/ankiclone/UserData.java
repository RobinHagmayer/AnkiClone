package dev.hagmayer.ankiclone;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(decks, userData.decks);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(decks);
    }
}
