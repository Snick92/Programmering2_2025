package no.hiof.sindrean.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TVSeriesJSONRepository implements TVSeriesRepository {
    private File file;
    private ObjectMapper objectMapper;

    public TVSeriesJSONRepository(File file) {
        this.file = file;
        this.objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); // Håndterer LocalDate
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Gjør JSON mer lesbar
    }

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try {
            objectMapper.writeValue(file, listOfTVSeries);
            System.out.println("TV-serier er lagret i JSON-filen!");
        } catch (IOException e) {
            System.err.println("Feil ved skriving til JSON-filen: " + e.getMessage());
        }
    }

    @Override
    public void addListOfTVSeries(List<TVSeries> listOfTVSeries) {

    }



    @Override
    public List<TVSeries> getAllTVSeries() {
        try {
            // Sjekk om filen finnes og ikke er tom
            if (file.exists() && file.length() > 0) {
                // Les JSON og konverter til liste av TVSeries
                return objectMapper.readValue(file,
                        objectMapper.getTypeFactory().constructCollectionType(List.class, TVSeries.class));
            }
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra JSON-filen: " + e.getMessage());
        }

        return new ArrayList<>(); // Returnerer en tom liste hvis noe går galt
    }

    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        try {
            // Sjekk om filen finnes og ikke er tom
            if (file.exists() && file.length() > 0) {
                // Les inn hele JSON-filen som en liste av TVSeries-objekter
                List<TVSeries> tvSeriesList = objectMapper.readValue(file,
                        objectMapper.getTypeFactory().constructCollectionType(List.class, TVSeries.class));

                // Søk etter TV-serien med gitt tittel
                for (TVSeries tvSeries : tvSeriesList) {
                    if (tvSeries.getTitle().equalsIgnoreCase(title)) {
                        return tvSeries; // Returner hvis tittelen matcher
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra JSON-filen: " + e.getMessage());
        }

        return null; // Returnerer null hvis TV-serien ikke finnes
    }

}
