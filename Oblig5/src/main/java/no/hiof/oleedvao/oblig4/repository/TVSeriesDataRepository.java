package no.hiof.oleedvao.oblig4.repository;

import no.hiof.oleedvao.oblig4.model.TVSeries;

import java.util.ArrayList;
import java.util.List;

public class TVSeriesDataRepository implements TVSeriesRepository {

    ArrayList<TVSeries> allTVSeries;

    public TVSeriesDataRepository() {
        allTVSeries = new ArrayList<>();
        TVSeries Seinfeld = new TVSeries();
        allTVSeries.add(Seinfeld);

    }


    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        return allTVSeries;
    }

    @Override
    public TVSeries getTVSeries(String title) {
        return null;
    }

    @Override
    public TVSeries getTitle(String title) {
        for (TVSeries series : allTVSeries) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null;
    }

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {

    }
}
