package oblig3.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {

    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes;
    private double averageRunTime;
    private int numSeasons = 0;

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.episodes = new ArrayList<>();
    }

    private void updateAverageRuntime() {
        if (episodes.isEmpty()) {
            this.averageRunTime = 0;
            return;
        }

        int totalRuntime = 0;
        for (Episode ep : episodes) {
            totalRuntime += ep.getRuntimeInMinutes();
        }

        this.averageRunTime = (double) totalRuntime / episodes.size();
    }


    public void addEpisode(Episode episode) {
        if (numSeasons == 0 || episode.getSeasonNumber() <= numSeasons + 1) {
            this.episodes.add(episode);
            updateAverageRuntime();

            if (episode.getSeasonNumber() > numSeasons) {
                numSeasons = episode.getSeasonNumber();  // Oppdaterer numSeasons riktig
            }
        } else {
            System.out.println("Kan ikke legge til episode i sesong " + episode.getSeasonNumber()
                    + ". Du kan kun legge til episoder i sesong 1 til " + (numSeasons));
        }
    }

    @Override
    public String toString() {
        return "TV Series: " + title +
                "\nGenre: " + description +
                "\nRelease Date: " + releaseDate +
                "\nNumber of Episodes: " + episodes.size() +
                "\nNumber of Seasons: " + numSeasons +
                "\nAverage Runtime: " + averageRunTime + " min";
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

    public ArrayList<Role> hentRollebesetning() {
        ArrayList<Role> roller = new ArrayList<>();

        for (Episode episode : episodes) {
            roller.addAll(episode.getRoles());
        }

        return roller;
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
