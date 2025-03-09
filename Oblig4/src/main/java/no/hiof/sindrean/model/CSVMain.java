package no.hiof.sindrean.model;

import no.hiof.sindrean.model.TVSeries;
import no.hiof.sindrean.model.TVSeriesCSVRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class CSVMain {
    public static void main(String[] args) {
        File csvFile = new File("tvseries.csv");
        TVSeriesCSVRepository repository = new TVSeriesCSVRepository(csvFile);

        // Opprett en liste med TV-serier
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(new TVSeries("Breaking Bad", "En kjemilærer blir narkobaron", LocalDate.of(2008, 1, 20)));
        tvSeriesList.add(new TVSeries("Game of Thrones", "Kampen om jerntronen", LocalDate.of(2011, 4, 17)));
        tvSeriesList.add(new TVSeries("Stranger Things", "Mystiske hendelser i Hawkins", LocalDate.of(2016, 7, 15)));

        // Lagre TV-seriene til CSV-filen
        repository.addListOfTVSeries(tvSeriesList);
    }
}
