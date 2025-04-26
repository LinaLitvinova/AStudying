package TheWitcher;

import java.io.*;


public class WitcherFile {
    private static final String file_name = "Witcher.txt";

    private static void main(String[] args) {
        String dataToWrite = "Геральт, ты, как бы это помягче сказать, п...шь";

        writeToFile(dataToWrite);

        readFromFile();
    }

    private static void writeToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_name))) {
            writer.write(data);
            System.out.println("Данные записаны в " + file_name);
        } catch (IOException e) {
            System.out.println("ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file_name))) {
            String line;
            System.out.println("Данные из файла: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла: " + e.getMessage());

        }
    }
}
