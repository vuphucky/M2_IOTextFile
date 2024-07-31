import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static List<String> praseCsvLine(String csvLine){
        List<String> result = new ArrayList<>();
        if (csvLine != null){
            String[] splitData = csvLine.split(",");
            for (int k = 0; k < splitData.length; k++){
                result.add((splitData[k]));
            }
        }
        return result;
    }

    public static void printCountry(List<String> country){
        System.out.println("Country [id= " + country.get(0)
        + ", code = " + country.get(1) + ", name = " + country.get(2) + "]");
    }


    public static void main(String[] args) {
        try(FileReader fr = new FileReader("countries.csv");
             BufferedReader br = new BufferedReader(fr))
        {
            String line;
            while ((line = br.readLine()) != null){
                  printCountry(praseCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}