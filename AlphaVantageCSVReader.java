package sample.AlphaVantage;

import sample.CSVReader;

import java.io.*;
import java.util.ArrayList;

public class AlphaVantageCSVReader extends CSVReader {

    private String FilePath;
    private String Separator;
    private BufferedReader bufferedReader;

    public String getMeasurementType() {
        return measurementType;
    }

    protected String measurementType = "";

    public AlphaVantageCSVReader(String filePath, String separator) throws FileNotFoundException {
        FilePath = filePath;
        Separator = separator;
        bufferedReader = getBufferedReader(this.FilePath);
    }

    public AlphaVantageCSVReader() { }

    public void printAllCSVLines(boolean dataOnly)throws IOException {
        String line = "";
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0 && dataOnly) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }
            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);

            lineCount++;
        }


    }

    public ArrayList<String> getDates() throws IOException{
        String line = "";
        ArrayList<String> results = new ArrayList<>();
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }
            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);
            String[] dates = data[0].split(" ");
            System.out.println(dates[0]);
            results.add(dates[0]);

            lineCount++;
        }

        return results;
    }

    public ArrayList<String> getTimes() throws IOException{
        String line = "";
        ArrayList<String> results = new ArrayList<>();
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }
            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);
            String[] dates = data[0].split(" ");

            results.add(dates[1]);

            lineCount++;
        }

        return results;
    }

    public ArrayList<Number> getOpenPrices() throws IOException{
        this.measurementType = "Open Price";
        String line = "";
        ArrayList<Number> results = new ArrayList<>();
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }
            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);
            float result = Float.valueOf(data[1]);
            results.add(result);

            lineCount++;
        }

        return results;
    }

    public ArrayList<Number> getHighPrices() throws IOException {
        this.measurementType = "High Price";
        String line = "";
        ArrayList<Number> results = new ArrayList<>();
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }
            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);
            float result = Float.valueOf(data[2]);
            results.add(result);

            lineCount++;
        }

        return results;
    }

    public ArrayList<Number> getLowPrices() throws IOException {
        this.measurementType = "Low Price";
        String line = "";
        ArrayList<Number> results = new ArrayList<>();
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }
            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);
            float result = Float.valueOf(data[1]);
            results.add(result);

            lineCount++;
        }

        return results;
    }

    public ArrayList<Number> getClosePrices() throws IOException {
        this.measurementType = "Close Price";
        String line = "";
        ArrayList<Number> results = new ArrayList<>();
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }
            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);
            float result = Float.valueOf(data[1]);
            results.add(result);

            lineCount++;
        }

        return results;
    }

    public ArrayList<Number> getVolume() throws IOException {
        this.measurementType = "Volume";
        String line = "";
        ArrayList<Number> results = new ArrayList<>();
        int lineCount = 0;
        while ((line = this.bufferedReader.readLine()) != null) {
            if (lineCount == 0) {
                // The first line of the CSV file is headers.
                // Therefore skip this line if dataOnly == true
                lineCount++;
                continue;
            }

            // While there are still lines to read in BufferedReader,
            // Print out the data from that line
            String[] data = line.split(this.Separator);
            float result = Float.valueOf(data[5]);
            results.add(result);

            lineCount++;
        }

        return results;
    }


}
