package oblig3;

import oblig3.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Oblig3Main {


    public static void main(String[] args) {

        // Regissører:
        Person directorOne = new Person("Stanley","Kubrick", "Stanley Kubrick");
        Person directorTwo = new Person ("David", "Lean", "David Lean");
        Person directorThree = new Person("John", "Sturges", "John Sturges");
        Person directorFour = new Person ("Jonathan", "Glassner", "Jonathan Glassner");


        // Skuespillere og roller:
        Person actorOne = new Person ("Richard Dean", "Anderson");
        Role roleOne = new Role("Jack", "O'Neill", actorOne);

        Person actorTwo = new Person ("Michael", "Shanks");
        Role roleTwo = new Role ("Daniel", "Jackson", actorTwo);

        Person actorThree= new Person ("Amanda", "Tapping");
        Role roleThree = new Role ("Samantha", "Carter", actorThree);

        Person actorFour = new Person ("Christopher", "Judge");
        Role roleFour = new Role ("Teal'c", "", actorFour);

        Person actorFive = new Person("Kirk", "Douglas");
        Role roleFive = new Role("Col. Dax", "", actorFive);

        Person actorSix = new Person ("George", "Macready");
        Role roleSix = new Role ("Gen. Paul", "Mireau", actorSix);

        Person actorSeven = new Person ("Peter", "O'Toole");
        Role roleSeven = new Role ("T.E.", "Lawrence", actorSeven);

        Person actorEight = new Person ("Alec", "Guiness");
        Role roleEight = new Role ("Prince Faisal I", "bin al-Hussein", actorEight);

        Person actorNine = new Person ("Steve", "McQueen");
        Role roleNine = new Role ("Virgil", "Hilts", actorNine);

        Person actorTen = new Person ("Richard", "Attenborough");
        Role roleTen = new Role ("Roger", "Bartlett", actorTen);

        // TV-serie:
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

        // Filmer:
        Movie movieOne = new Movie("Paths of Glory", 88, LocalDate.of(1957,12,20), "Lorem ipsum...", directorOne);
        Movie movieTwo = new Movie("Lawrence of Arabia", 216, LocalDate.of(1962,12,10), "Lorem ipsum...", directorTwo);
        Movie movieThree = new Movie ("The Great Escape", 172, LocalDate.of(1963,07,04), "Lorem ipsum...", directorThree);

        // Tester metode for å legge til en skuespiller:
        movieOne.addToRoles(roleFive);
        movieOne.addToRoles(roleSix);

        // Tester metode for å legge til flere skuespillere i samme film:
        ArrayList<Role> movieTwoAllRoles = new ArrayList<>();
        movieTwoAllRoles.add(roleSeven);
        movieTwoAllRoles.add(roleEight);
        movieTwo.addToRoles(movieTwoAllRoles);

        ArrayList<Role> movieThreeAllRoles = new ArrayList<>();
        movieThreeAllRoles.add(roleNine);
        movieThreeAllRoles.add(roleTen);
        movieThree.addToRoles((movieThreeAllRoles));

        System.out.println("\n--- Film 1 ---");
        System.out.println(movieOne);
        System.out.println("Roller:");
        for (Role role : movieOne.getRoles()) {
            System.out.println(role);
        }

        System.out.println("\n--- Film 2 ---");
        System.out.println(movieTwo);
        System.out.println("Roller:");
        for (Role role : movieTwo.getRoles()) {
            System.out.println(role);
        }

        System.out.println("\n--- Film 3 ---");
        System.out.println(movieThree);
        System.out.println("Roller:");
        for (Role role : movieThree.getRoles()) {
            System.out.println(role);
        }

        System.out.println();
        System.out.println("\n--- Test av fullName ---");
        System.out.println("Director: " + directorOne.getfullName());



    }
}
