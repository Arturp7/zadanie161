import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        ArrayList<Player> players2 = arrayUtils.players();
        System.out.println(players2);
        Collections.sort(players2);
        System.out.println(players2);
        String fileName = "stats.csv";
        try (
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter);
        ) {
            int i = 0;
            while (i < players2.size() ) {
                writer.write(players2.get(i).toString());
                writer.newLine();
                i++;
            }


        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku");
        }


    }
}
