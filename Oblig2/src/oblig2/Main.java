package oblig2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        TVSeries stargate = new TVSeries("Stargate SG-1", "Sci-fi", LocalDate.of(1997,7,27));

        //Episode episodeOne = new Episode("Children of the Gods", 1, 1, 92);
        //Episode episodeTwo = new Episode("The Enemy Within", 2, 1, 44);
        //Episode episodeThree = new Episode("Emancipation", 3, 1, 44);


        //for(<gjør dette før løkken starter (init)>; <skal kjøre så lenge dette er sant>; <gjør dette på slutten av hver løkke>) {}
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
        System.out.println("\n--- Gjennomsnittslengden på episoder ---");
        System.out.println("Average runtime: " + Math.round(stargate.averageRunTime()) + " minutes");
        System.out.println("\n--- Prøver å legge til ny sesong ---");
        stargate.addEpisode(new Episode("Test-episode", 11, 7, 44));


        System.out.println("\n --- Printer ut informasjon om alle episodene i sesong 4 ---");
        ArrayList<Episode> episodeInSeasonFour = stargate.getEpisodesInSeason(4);
        for (Episode ep : episodeInSeasonFour) {
            System.out.println(ep);
        }


    }
}
