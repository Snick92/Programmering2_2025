package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class DinosaurWriteToJSON {
    public static void main(String[] args) throws Exception {
        Brontosaurus dino = new Brontosaurus(); // Bruker en konkret klasse

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("dinosaur.json"), dino); // Lagrer til fil

        System.out.println("Dinosaur lagret i JSON-fil.");
    }
}
