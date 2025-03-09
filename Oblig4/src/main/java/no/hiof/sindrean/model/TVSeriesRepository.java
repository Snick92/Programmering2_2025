package no.hiof.sindrean.model;

import no.hiof.sindrean.model.TVSeries;

import java.util.ArrayList;
import java.util.List;

public interface TVSeriesRepository {
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);

    void addListOfTVSeries (List<TVSeries> listOfTVSeries);
    List<TVSeries> getAllTVSeries();
    TVSeries getTVSeriesByTitle (String title);



}
