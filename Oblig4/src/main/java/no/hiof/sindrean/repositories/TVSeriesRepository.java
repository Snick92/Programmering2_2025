package no.hiof.sindrean.repositories;

import no.hiof.sindrean.model.TVSeries;

import java.util.ArrayList;
import java.util.List;

// 'Interface' for TV-serie-repository:
public interface TVSeriesRepository {

    // Legger til 'ArrayList' med TV-serier:
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);

    // Legger til 'List' med TV-serier:
    void addListOfTVSeries(List<TVSeries> listOfTVSeries);

    // Henter alle TV-serier:
    List<TVSeries> getAllTVSeries();

    // Henter en TV-serie ut fra tittelen:
    TVSeries getTVSeriesByTitle(String title);
}
