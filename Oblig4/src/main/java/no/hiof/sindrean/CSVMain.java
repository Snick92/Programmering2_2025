package no.hiof.sindrean;

import no.hiof.sindrean.model.TVSeries;
import no.hiof.sindrean.repositories.TVSeriesCSVRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class CSVMain {
    public static void main(String[] args) {

        //div. TV-serier:
        TVSeries bandOfBrothers = new TVSeries ("Band of Brothers", "The story of Easy Company", LocalDate.of(2001, 9, 9));
        TVSeries theTerror = new TVSeries("The Terror", "Supernatural horror drama", LocalDate.of(2018, 3, 25));
        TVSeries theGrandTour = new TVSeries("The Grand Tour", "British auto show", LocalDate.of(2016, 11, 18));

        //Arraylist med tv-serier
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(bandOfBrothers);
        tvSeriesList.add(theTerror);
        tvSeriesList.add(theGrandTour);

        // skriver til ny fil (repository)
        File csvFile = new File("tvseries.csv");

        TVSeriesCSVRepository repository = new TVSeriesCSVRepository(csvFile);
        repository.addListOfTVSeries(tvSeriesList);

        // Henter tv-seriene fra fila (tvseries.csv):
        ArrayList<TVSeries> allTVSeries = repository.getAllTVSeries();
        System.out.println("*** TV-serier hentet fra fil ***");
        //Løkke for å hente alle tv-serier:
        for (TVSeries tvSeries : allTVSeries) {
            System.out.println(tvSeries);
            System.out.println();
        }

        //Søker etter spesifikk tv-serie:
        TVSeries foundSeries = repository.getTVSeriesByTitle("Band of Brothers");
        //Løkke for funnet/ikke funnet tv-serie:
        if (foundSeries != null) {
            System.out.println("*** Fant TV-serien ***" + "\n" + foundSeries);
        } else {
            System.out.println("*** TV-serien ble ikke funnet ***" + "\n" + "...");
        }

    }
}
