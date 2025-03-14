package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class DinosaurReadFromJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Dinosaur dino = objectMapper.readValue(new File("dinosaur.json"), Dinosaur.class);
        System.out.println("Dinosaur lastet fra JSON-fil.");
    }
}
