package oblig2;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {

    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes;
    private double averageRunTime;

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.episodes = new ArrayList<>();
    }

    /*private updateAverageRuntime() {
        må lage metode
        // Uferdig:
        ArrayList Episode[] = {};
        float avg, sum = 0;
        int length = Episode.length;
        for (ArrayList allEpisodes : Episode){
            ;
        }
        avg = sum / length;
        System.out.println(avg);
    }*/

    public void addEpisode(Episode episode) {
        this.episodes.add(episode);
    }

    public String toString() {
        String tempString = "TV-series title: " + this.title
                + "\nDescription: " + this.description
                + "\nRelease date: " + this.releaseDate
                + "\nNumber of episodes: " + this.episodes;
        return tempString;
    }

    public ArrayList<Episode> getEpisodesInSeason(int season) {
        ArrayList<Episode> episodesInSeason = new ArrayList<>();
        for (Episode ep : episodes) {
            if (ep.getSeasonNumber() == season) {
                episodesInSeason.add(ep);
            }
        }
        return episodesInSeason;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }




    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }
    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }
    public double averageRunTime() {
        return averageRunTime;
    }

}
