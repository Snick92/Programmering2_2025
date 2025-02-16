package oblig3.model;

public class Movie extends Production {


    public Movie(String title, int runtimeInMinutes) {
        super(title, runtimeInMinutes);
    }

    public Movie(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "Movie title: " + getTitle() + "\nRuntime: " + getRuntimeInMinutes() + " minutes\n";
    }
}
