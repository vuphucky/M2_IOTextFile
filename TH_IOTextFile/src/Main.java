import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("tong = " + sum);
        } catch (Exception e){
            System.out.println("file ko ton tai or noi dung file loi");
        }
    }
    public static void main(String[] args) {
        System.out.println("nhap duong dan file:");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        readFileText(path);
    }
}