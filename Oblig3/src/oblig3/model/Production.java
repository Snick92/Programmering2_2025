package oblig3.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Production {
    private String title;
    private int runtimeInMinutes;
    private LocalDate releaseDate;
    private String description;
    private Person director;
    private ArrayList<Role> roles;

    // All informasjon:
    public Production(String title, int runtimeInMinutes, LocalDate releaseDate, String description, Person director) {
        this.title = title;
        this.runtimeInMinutes = runtimeInMinutes;
        this.releaseDate = releaseDate;
        this.description = description;
        this.director = director;
        this.roles = new ArrayList<>();
    }

    // Kun tittel:
    public Production(String title) {
        this.title = title;
        this.runtimeInMinutes = 0;
    }

    public void addToRoles(Role role) {
        this.roles.add(role);
    }

    public void addToRoles(ArrayList<Role> listOfRoles) {
        this.roles.addAll (listOfRoles);
    }

    public ArrayList<Role> getRoles() {
        return new ArrayList<>(roles);
    }

    public void setRoles(ArrayList roles) {
        this.roles = roles;
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
