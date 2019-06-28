import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUtils {

    ArrayList<Player> players() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        String nextLine = "";

        do {
            System.out.println("Podaj imie , nazwisko i wynik gracza (lub stop)");
            nextLine = scan.nextLine();
            if (!(nextLine.equals("stop"))) {
                String[] split = nextLine.split(" ");
                players.add(new Player(split[0], split[1], Integer.valueOf(split[2])));
                // System.out.println();
            }
        } while (!(nextLine.equals("stop")));
        
        return players;
    }
}

