package oblig3;

import oblig3.model.Episode;
import oblig3.model.Movie;
import oblig3.model.Person;
import oblig3.model.TVSeries;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Oblig3Main {


    public static void main(String[] args) {

        Person directorOne = new Person("Stanley","Kubrick", "Stanley Kubrick");
        Person directorTwo = new Person ("David", "Lean", "David Lean");
        Person directorThree = new Person("John", "Sturges", "John Sturges");
        Person directorFour = new Person ("Jonathan", "Glassner", "Jonathan Glassner");


        TVSeries stargate = new TVSeries("Stargate SG-1", "Sci-fi", LocalDate.of(1997,7,27));

        Random random = new Random();
        for (int seasonNumber = 1; seasonNumber <= 5; seasonNumber++) {
            for (int episodeNumber = 1; episodeNumber <= 10; episodeNumber++) {
                int randomRuntime = 20 + random.nextInt(11);
                Episode episode = new Episode("Episode " + episodeNumber, episodeNumber, seasonNumber, randomRuntime, LocalDate.of(1997, 7, 27), "Random episode", directorFour);
                stargate.addEpisode(episode);
            }
        }

        System.out.println();
        System.out.println("--- Informasjon om serie ---");
        System.out.println(stargate);

        System.out.println("\n--- Episoder i sesong 4 ---");
        ArrayList<Episode> episodeInSeasonFour = stargate.getEpisodesInSeason(4);
        for (Episode ep : episodeInSeasonFour) {
            System.out.println(ep + "\n");
        }


        Movie movieOne = new Movie("Paths of Glory", 88, LocalDate.of(1957,12,20), "Lorem ipsum...", directorOne);
        Movie movieTwo = new Movie("Lawrence of Arabia", 216, LocalDate.of(1962,12,10), "Lorem ipsum...", directorTwo);
        Movie movieThree = new Movie ("The Great Escape", 172, LocalDate.of(1963,07,04), "Lorem ipsum...", directorThree);

        System.out.println("\n--- Filmer ---");
        System.out.println(movieOne);
        System.out.println(movieTwo);
        System.out.println(movieThree);

        System.out.println("\n--- Test av fullName ---");
        System.out.println("Director: " + directorOne.getfullName());



    }
}
