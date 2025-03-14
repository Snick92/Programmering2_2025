package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DinosaurCSVRepository {
    private String filePath;

    public DinosaurCSVRepository(String filePath) {
        this.filePath = filePath;
    }

    public void saveDinosaursToCSV(List<Dinosaur> dinosaurs) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Dinosaur dino : dinosaurs) {
                writer.write(dino.getClass().getName() + "," + dino.eat());
                writer.newLine();
            }
            System.out.println("Dinosaurer lagret i CSV-filen.");
        } catch (IOException e) {
            System.err.println("Feil" + e.getMessage());
        }
    }
}
