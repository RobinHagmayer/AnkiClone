package dev.hagmayer.ankiclone;

import com.fatboyindustrial.gsonjavatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class DataPersister {
    private static final String DATA_FILE = "anki_data.json";
    private final Gson gson;

    public DataPersister() {
        gson = Converters.registerLocalDate(new GsonBuilder()).setPrettyPrinting().create();
    }

    public void saveData(UserData userData) {
        // TODO: Tests and better error handling
        if (userData == null) {
            throw new RuntimeException();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE))) {
            gson.toJson(userData, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public UserData loadData() {
        // TODO: Tests and better error handling
        // What if someone modified the JSON and Gson can't deserialize it?
        // What if the file is missing?
        // Does this correctly recreate the UserData object?
        // Do we want to bubble up the exception?
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            UserData userData = gson.fromJson(reader, UserData.class);
            if (userData == null) {
                throw new RuntimeException();
            }
            return userData;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
