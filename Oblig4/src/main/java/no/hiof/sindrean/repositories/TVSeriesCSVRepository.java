package no.hiof.sindrean.repositories;

import no.hiof.sindrean.model.TVSeries;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TVSeriesCSVRepository implements TVSeriesRepository {
    private File file;

    public TVSeriesCSVRepository(File file) {
        this.file = file;
    }

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (TVSeries tvSeries : listOfTVSeries) {
                String csvLine = tvSeries.getTitle() + "," +
                        tvSeries.getDescription() + "," +
                        tvSeries.getReleaseDate().getYear() + "," +
                        tvSeries.getReleaseDate().getMonthValue() + "," +
                        tvSeries.getReleaseDate().getDayOfMonth();
                writer.write(csvLine);
                writer.newLine();
            }
            System.out.println("*** TV-serier er lagret i CSV-filen ***" + "\n" + "..." + "\n");
        } catch (IOException error) {
            System.err.println("*** Feil ved skriving til CSV-filen ***" + error.getMessage());
        }
    }


    @Override
    public void addListOfTVSeries(List<TVSeries> listOfTVSeries) {
        
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");


                String title = data[0];
                String description = data[1];
                int year = Integer.parseInt(data[2]);
                int month = Integer.parseInt(data[3]);
                int day = Integer.parseInt(data[4]);


                TVSeries tvSeries = new TVSeries(title, description, LocalDate.of(year, month, day));
                tvSeriesList.add(tvSeries);
            }
        } catch (IOException error) {
            System.err.println("*** Feil ved lesing fra CSV-filen ***" + "\n" + error.getMessage());
        }

        return tvSeriesList;
    }


    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String fileTitle = data[0];
                String description = data[1];
                int year = Integer.parseInt(data[2]);
                int month = Integer.parseInt(data[3]);
                int day = Integer.parseInt(data[4]);

                if (fileTitle.equalsIgnoreCase(title)) {
                    return new TVSeries(fileTitle, description, LocalDate.of(year, month, day));
                }
            }
        } catch (IOException error) {
            System.err.println("*** Feil ved lesing fra CSV-filen ***" + "\n" + error.getMessage());
        }
        return null;
    }

}
