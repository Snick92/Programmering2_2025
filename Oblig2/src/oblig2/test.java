package oblig2;


import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int number;

        number = 42;
        System.out.println(number);


        long longNumber = 4_500_000_000_000_233L;
        System.out.println(longNumber);

        long sum = longNumber * number;
        System.out.println(sum);

        double doubleNumber = 1.123456789;
        System.out.println(doubleNumber);

        float floatNumber = 12.2345678910f;
        System.out.println(floatNumber);
        System.out.println(floatNumber * doubleNumber);

        int decimalToInteger = (int) doubleNumber;
        System.out.println(decimalToInteger);

        int newNumber = number;
        System.out.println(newNumber);
        number = 50;
        System.out.println(number);

        String[] arrayOfEpisodes = new String[5];
        arrayOfEpisodes[0] = "Episode 1";
        arrayOfEpisodes[1] = "Episode 2";
        arrayOfEpisodes[2] = "Episode 3";
        arrayOfEpisodes[3] = "Episode 4";
        arrayOfEpisodes[4] = "Episode 5";

        System.out.println(Arrays.toString(arrayOfEpisodes));


    }
}
