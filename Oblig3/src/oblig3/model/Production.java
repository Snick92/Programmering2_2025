package oblig3.model;

import java.time.LocalDate;

public class Production {
    private String title;
    private int runtimeInMinutes;
    private LocalDate releaseDate;

    // Tittel og lengde:
    public Production(String title, int runtimeInMinutes) {
        this.title = title;
        this.runtimeInMinutes = runtimeInMinutes;
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
}
