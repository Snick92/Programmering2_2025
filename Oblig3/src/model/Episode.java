package model;

public class Episode {

    private String title;
    private int episodeNumber;
    private int seasonNumber;
    private int runtime; // minutter (round?)

    public Episode(String title, int episodeNumber, int seasonNumber, int runtime) {

        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtime = runtime;
    }

    public Episode(String title, int episodeNumber, int seasonNumber) {

        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtime = 0;
    }

    public String toString() {
        String tempString = "\nEpisode title: " + this.title
                            + "\nEpisode number: " + this.episodeNumber
                            + "\nSeason number: " + this.seasonNumber
                            + "\nRuntime in minutes: " + this.runtime + "\n";
        return tempString;
    }




    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getEpisodeNumber() {
        return episodeNumber;
    }
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
    public int getSeasonNumber() {
        return seasonNumber;
    }
    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
    public int getRuntime() {
        return runtime;
    }
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

}
