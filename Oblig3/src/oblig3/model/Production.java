package oblig3.model;

import java.time.LocalDate;

public class Production {
    private String title;
    private int runtimeInMinutes;
    private LocalDate releaseDate;
    private String description;
    private Person director;

    // Tittel og lengde:
    public Production(String title, int runtimeInMinutes, LocalDate releaseDate, String description, Person director) {
        this.title = title;
        this.runtimeInMinutes = runtimeInMinutes;
        this.releaseDate = releaseDate;
        this.description = description;
        this.director = director;
    }

    // Kun tittel:
    public Production(String title) {
        this.title = title;
        this.runtimeInMinutes = 0;
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate (LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

}
