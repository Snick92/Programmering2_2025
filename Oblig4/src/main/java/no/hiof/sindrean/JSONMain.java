package no.hiof.sindrean;

import no.hiof.sindrean.model.TVSeries;
import no.hiof.sindrean.repositories.TVSeriesJSONRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JSONMain {
    public static void main(String[] args) {

        // Lager ny JSON-fil for tv-serier:
        File jsonFile = new File ("tvseries.json");
        TVSeriesJSONRepository repository = new TVSeriesJSONRepository(jsonFile);

        // Oppretter noen eksmpelserier:
        TVSeries bandOfBrothers = new TVSeries ("Band of Brothers", "The story of Easy Company", LocalDate.of(2001, 9, 9));
        TVSeries theTerror = new TVSeries("The Terror", "Supernatural horror drama", LocalDate.of(2018, 3, 25));
        TVSeries theGrandTour = new TVSeries("The Grand Tour", "British auto show", LocalDate.of(2016, 11, 18));

        // Oppretter arraylist for tv-seriene:
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        // Legger seriene i arraylisten:
        tvSeriesList.add(bandOfBrothers);
        tvSeriesList.add(theTerror);
        tvSeriesList.add(theGrandTour);

        // Legger arraylisten (med tv-serier) i eget repository med metoden addListOfTVSeries:
        repository.addListOfTVSeries(tvSeriesList);

        // Henter arraylisten med serier fra repository med metoden getALlTVSeries:
        List<TVSeries> allTVSeries = repository.getAllTVSeries();
        System.out.println("*** TV-serier hentet fra JSON-fil ***");
        for (TVSeries tvSeries : allTVSeries) {
            System.out.println(tvSeries);
            System.out.println();
        }

        // Søker etter serie i repository med metoden getTVSeriesByTitle..
        TVSeries foundSeries = repository.getTVSeriesByTitle("Sesam Stasjon");

        // (if/else)sjekker om serien finnes i repository:
        if (foundSeries != null) {
            System.out.println("*** Fant TV-serien ***" + "\n" + foundSeries);
        } else {
            System.out.println("*** TV-serien ble ikke funnet ***" + "\n" + "..." + "\n");
        }

        // ny if-sjekk med en serie som faktisk befinner seg i repository:
        TVSeries foundSeries2 = repository.getTVSeriesByTitle("Band of Brothers");

        if (foundSeries2 != null) {
            System.out.println("*** Fant TV-serien ***" + "\n" + foundSeries2);
        } else {
            System.out.println("*** TV-serien ble ikke funnet ***" + "\n");
        }


    }

}
