package no.hiof.sindrean.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.sindrean.model.TVSeries;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Klasse (lagring og henting av TV-serier i en JSON-fil)
public class TVSeriesJSONRepository implements TVSeriesRepository {
    private File file;
    private ObjectMapper objectMapper;

    // Konstruktør (initialiserer filen og ObjectMapper)
    public TVSeriesJSONRepository(File file) {
        this.file = file;
        this.objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    // Lagrer en liste av TV-serier til JSON-fila
    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try {
            objectMapper.writeValue(file, listOfTVSeries);
            System.out.println("*** TV-serier er lagret i JSON-filen ***" + "\n" + "..." + "\n");
        } catch (IOException error) {
            System.err.println("*** Feil ved skriving til JSON-filen ***" + "\n" + error.getMessage());
        }
    }

    // 'Overload' (?) addListOfTVSeries
    @Override
    public void addListOfTVSeries(List<TVSeries> listOfTVSeries) {

    }

    // Henter ALLE TV-serier fra JSON-filen
    @Override
    public List<TVSeries> getAllTVSeries() {
        try {
            if (file.exists() && file.length() > 0) {
                return objectMapper.readValue(file,
                        objectMapper.getTypeFactory().constructCollectionType(List.class, TVSeries.class));
            }
        } catch (IOException error) {
            System.err.println("*** Feil ved lesing fra JSON-filen ***" + "\n" + error.getMessage());
        }
        return new ArrayList<>();
    }

    // Henter en SPESIFIKK TV-serie
    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        try {
            if (file.exists() && file.length() > 0) {
                List<TVSeries> tvSeriesList = objectMapper.readValue(file,
                        objectMapper.getTypeFactory().constructCollectionType(List.class, TVSeries.class));

                for (TVSeries tvSeries : tvSeriesList) {
                    if (tvSeries.getTitle().equalsIgnoreCase(title)) {
                        return tvSeries;
                    }
                }
            }
        } catch (IOException error) {
            System.err.println("*** Feil ved lesing fra JSON-filen ***" + "\n" + error.getMessage());
        }

        return null;
    }
}
