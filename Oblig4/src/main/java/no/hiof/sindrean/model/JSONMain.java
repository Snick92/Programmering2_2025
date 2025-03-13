package no.hiof.sindrean.model;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JSONMain {
    public static void main(String[] args) {

        File jsonFile = new File ("tvseries.json");
        TVSeriesJSONRepository repository = new TVSeriesJSONRepository(jsonFile);


        TVSeries bandOfBrothers = new TVSeries ("Band of Brothers", "The story of Easy Company", LocalDate.of(2001, 9, 9));
        TVSeries theTerror = new TVSeries("The Terror", "Supernatural horror drama", LocalDate.of(2018, 3, 25));
        TVSeries theGrandTour = new TVSeries("The Grand Tour", "British auto show", LocalDate.of(2016, 11, 18));

        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(bandOfBrothers);
        tvSeriesList.add(theTerror);
        tvSeriesList.add(theGrandTour);

        repository.addListOfTVSeries(tvSeriesList);


        
        List<TVSeries> allTVSeries = repository.getAllTVSeries();


        System.out.println("TV-serier hentet fra JSON-fil:");
        for (TVSeries tvSeries : allTVSeries) {
            System.out.println(tvSeries);
        }


        TVSeries foundSeries = repository.getTVSeriesByTitle("Sesam Stasjon");

        if (foundSeries != null) {
            System.out.println("Fant TV-serien: " + foundSeries);
        } else {
            System.out.println("TV-serien ble ikke funnet.");
        }

        TVSeries foundSeries2 = repository.getTVSeriesByTitle("Band of Brothers");


        if (foundSeries2 != null) {
            System.out.println("Fant TV-serien: " + foundSeries2);
        } else {
            System.out.println("TV-serien ble ikke funnet.");
        }


    }

}
