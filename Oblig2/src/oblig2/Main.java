package oblig2;

import java.security.spec.ECPoint;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    // test commit 05.02.2025 11:12
    public static void main(String[] args) {

        TVSeries stargate = new TVSeries("Stargate SG-1", "Sci-fi", LocalDate.of(1997,7,27));

        Episode episodeOne = new Episode("Children of the Gods", 1, 1, 92);
        Episode episodeTwo = new Episode("The Enemy Within", 2, 1, 44);
        Episode episodeThree = new Episode("Emancipation", 3, 1, 44);



        //for(<init>;<skal kjøre så lenge dette er sant>; <gjør dette på slutten av hver løkke>) {}
        //for(<gjør dette før løkken starter>;<skal kjøre så lenge dette er sant>; <gjør dette på slutten av hver løkke>) {}

        String tempEpisode = "";
        String tempSeason = "";
        String tempName = "Generisk navn";
        Episode episode;



        for(int seasonNumber=1; seasonNumber<=5; seasonNumber++) {
            tempSeason = "Season: " + seasonNumber;
            System.out.println("\n" + "--- " + tempSeason + " ---");


            for(int episodeNumber=1; episodeNumber <=10; episodeNumber++) {
                tempEpisode = "Episode: " + episodeNumber;
                episode = new Episode(tempName, episodeNumber, seasonNumber, 92);
                stargate.addEpisode(episode);

                System.out.println(tempEpisode + ", " + tempName);
                //Legg til metoden updateAverageRuntime() i løkka
            }
        }


        ArrayList<Episode> episodeInSeasonFour = stargate.getEpisodesInSeason(4);

        for (Episode ep : episodeInSeasonFour) {
            System.out.println(ep);
        }



    }
}
