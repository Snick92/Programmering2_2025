package oblig3.model;

import java.time.LocalDate;

public class Movie extends Production {


    public Movie(String title, int runtimeInMinutes, LocalDate releaseDate, String description, Person director) {
        super(title, runtimeInMinutes, releaseDate, description, director);
    }

    public Movie(String title) {
        super(title);
    }



    @Override
    public String toString() {
        return "Movie title: " + getTitle() + "\nRelease date: " + getReleaseDate() + "\nRuntime: " + getRuntimeInMinutes() + " minutes"
                + "\nDirector: " + getDirector() + "\nDescription: " + getDescription() + "\n";
    }



}
