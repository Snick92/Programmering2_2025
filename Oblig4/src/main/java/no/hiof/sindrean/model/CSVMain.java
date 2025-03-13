package no.hiof.sindrean.model;

import no.hiof.sindrean.model.TVSeries;
import no.hiof.sindrean.model.TVSeriesCSVRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class CSVMain {
    public static void main(String[] args) {

        TVSeries bandOfBrothers = new TVSeries ("Band of Brothers", "The story of Easy Company", LocalDate.of(2001, 9, 9));
        TVSeries theTerror = new TVSeries("The Terror", "Supernatural horror drama", LocalDate.of(2018, 3, 25));
        TVSeries theGrandTour = new TVSeries("The Grand Tour", "British auto show", LocalDate.of(2016, 11, 18));

        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(bandOfBrothers);
        tvSeriesList.add(theTerror);
        tvSeriesList.add(theGrandTour);

        File csvFile = new File("tvseries.csv");
        TVSeriesCSVRepository repository = new TVSeriesCSVRepository(csvFile);

        // Skriver TV-seriene til CSV-filen
        repository.addListOfTVSeries(tvSeriesList);

        // Hent alle TV-serier fra CSV-filen og skriv dem ut
        ArrayList<TVSeries> allTVSeries = repository.getAllTVSeries();
        System.out.println("TV-serier hentet fra fil:");
        for (TVSeries tvSeries : allTVSeries) {
            System.out.println(tvSeries);
        }

// Hent en spesifikk TV-serie basert på tittel
        TVSeries foundSeries = repository.getTVSeriesByTitle("Band of Brothers");
        if (foundSeries != null) {
            System.out.println("Fant TV-serien: " + foundSeries);
        } else {
            System.out.println("TV-serien ble ikke funnet.");
        }

    }
}
