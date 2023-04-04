import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class hw2 {
    private static Logger logger = Logger.getLogger("Homework logger");
    private static FileHandler fh;

    public static void main(String[] args) throws IOException {
        try {
            fh = new FileHandler("log.log");
            fh.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);

        int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
        bubbleSort(arr);

        parseStringFromFile("string.txt");
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    logger.info(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }

    public static String parseStringFromFile(String pathToFile) throws IOException {
        String template = "Студент %s получил %s по предмету %s";
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(pathToFile));
        } catch (FileNotFoundException e) {
            logger.info("There is no file here: " + pathToFile);
            throw new RuntimeException(e);
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] parameters = line.split("\"фамилия\":\"|\",\"оценка\":\"|\",\"предмет\":\"|\"");
                sb.append(String.format(template, parameters[1], parameters[2], parameters[3]));
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            System.out.println(sb.toString());
            return sb.toString();
        } catch (IOException e) {
            logger.info("Some error during reading the file occurred");
            throw new RuntimeException(e);
        } finally {
            br.close();
        }
    }
}