package no.hiof.sindrean.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TVSeriesCSVRepository implements TVSeriesRepository {
    private File file;
    private static final String DELIMITER = ";"; // Velger semikolon som skilletegn

    public TVSeriesCSVRepository(File file) {
        this.file = file;
    }

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (TVSeries tvSeries : listOfTVSeries) {
                String csvLine = tvSeries.getTitle() + DELIMITER +
                        tvSeries.getDescription() + DELIMITER +
                        tvSeries.getReleaseDate().getYear() + DELIMITER +
                        tvSeries.getReleaseDate().getMonthValue() + DELIMITER +
                        tvSeries.getReleaseDate().getDayOfMonth();
                writer.write(csvLine);
                writer.newLine(); // Ny linje for hver TV-serie
            }
            System.out.println("TV-serier er lagret i CSV-filen!");
        } catch (IOException e) {
            System.err.println("Feil ved skriving til CSV-filen: " + e.getMessage());
        }
    }

    @Override
    public void addListOfTVSeries(List<TVSeries> listOfTVSeries) {

    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        return new ArrayList<>(); // Implementeres senere
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        return null; // Implementeres senere
    }
}
