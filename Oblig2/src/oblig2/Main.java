package oblig2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    // test commit 05.02.2025 11:12
    public static void main(String[] args) {

        TVSeries stargate = new TVSeries("Stargate SG-1", "Sci-fi", LocalDate.of(1997,7,27));

        /*Episode epOne = new Episode("Children of the Gods", 1, 1, 92);
        Episode epTwo = new Episode("The Enemy Within", 2, 1, 44);
        Episode epThree = new Episode("Emancipation", 3, 1, 44);




        epOne.setTitle("Piss off");
        stargate.setTitle("Wank");

        stargate.addEpisode(epOne);
        stargate.addEpisode(epTwo);
        stargate.addEpisode(epThree); */

        //for(<init>;<skal skjøre så lenge dette er sant>; <gjør dette på slutten av hver løkke>) {}
        //for(<gjør dette før løkken starter>;<skal skjøre så lenge dette er sant>; <gjør dette på slutten av hver løkke>) {}

        String tempEpisode = "";
        String tempSeason = "";
        String tempName = "Generisk navn";
        Episode episodeOne;



        for(int seasonNumber=1; seasonNumber<=5; seasonNumber++) {
            tempSeason = "Season: " + seasonNumber;
            System.out.println(tempSeason);


            for(int episodeNumber=1; episodeNumber <=10; episodeNumber++) {
                tempEpisode = "Episode: " + episodeNumber;
                System.out.println(tempEpisode);

                episodeOne = new Episode(tempName, episodeNumber, seasonNumber, 92);
                stargate.addEpisode(episodeOne);

            }
        }


        ArrayList<Episode> episodeInSeasonFour = stargate.getEpisodesInSeason(4);

        for (Episode ep : episodeInSeasonFour) {
            System.out.println(ep);
        }
    }
}
