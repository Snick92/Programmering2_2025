package oblig3;

import oblig3.model.Episode;
import oblig3.model.Movie;
import oblig3.model.TVSeries;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Oblig3Main {

    public static void main(String[] args) {

        TVSeries stargate = new TVSeries("Stargate SG-1", "Sci-fi", LocalDate.of(1997,7,27));

        Random random = new Random();
        for(int seasonNumber=1; seasonNumber<=5; seasonNumber++) {
            for(int episodeNumber=1; episodeNumber<=10; episodeNumber++) {

                int randomRuntime = 20 + random.nextInt(11);
                Episode episodeRandomRuntime = new Episode("Episode " + episodeNumber, episodeNumber, seasonNumber, randomRuntime);
                stargate.addEpisode(episodeRandomRuntime);
            }
        }

        System.out.println();
        System.out.println("--- Informasjon om serien ---");
        System.out.println(stargate);

        System.out.println("\n--- Episoder i sesong 4 ---");
        ArrayList<Episode> episodeInSeasonFour = stargate.getEpisodesInSeason(4);
        for (Episode ep : episodeInSeasonFour) {
            System.out.println(ep);
        }


        Movie movieOne = new Movie("Paths of Glory", 88);
        Movie movieTwo = new Movie("Lawrence of Arabia", 216);
        Movie movieThree = new Movie ("The Great Escape", 172);

        System.out.println(movieOne);
        System.out.println(movieTwo);
        System.out.println(movieThree);




    }
}
