package core;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConfigReader {

    private static JsonNode configData;

    static {
        try {
            // Load the config.json file from the resources folder
            ObjectMapper mapper = new ObjectMapper();
            configData = mapper.readTree(new File("src/test/resources/config.json"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration file.");
        }
    }

    // Method to get the base URL
    public static String getLoginUrl() {
        return configData.get("loginUrl").asText();
    }

    // Method to get the username
    public static String getUsername() {
        return configData.get("credentials").get("username").asText();
    }

    // Method to get the password
    public static String getPassword() {
        return configData.get("credentials").get("password").asText();
    }
}
