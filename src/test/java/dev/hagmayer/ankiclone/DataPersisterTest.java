package dev.hagmayer.ankiclone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class DataPersisterTest {
    private DataPersister dataPersister;

    @BeforeEach
    void setUp() {
        dataPersister = new DataPersister();
    }

    // --- Test for saveData() method ---
    @Test
    @DisplayName("saveData() should store valid data")
    void saveData_whenGivenValidData_shouldStoreIt() {
        Card card1 = new Card("World", "Welt");
        Card card2 = new Card("Keyboard", "Tastatur");

        Deck deck = new Deck("Englisch - Deutsch");
        ArrayList<Card> cards = deck.getCards();
        cards.add(card1);
        cards.add(card2);

        UserData userData = new UserData();
        ArrayList<Deck> decks = userData.getDecks();
        decks.add(deck);

        dataPersister.saveData(userData);
        // TODO: maybe don't use loadData() for actual result
        // TODO: maybe use a mock
        assertEquals(userData, dataPersister.loadData());
    }

    // --- Test for loadData() method ---
}
