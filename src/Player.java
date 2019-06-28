import java.util.Objects;

public class Player implements Comparable<Player> {
    private String firstName;
    private String lastName;
    private int score;

    public Player(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return
                firstName + " " + lastName + ";" + score + "\n";

    }


    @Override
    public int compareTo(Player p) {

        return -Integer.compare(this.score, p.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score &&
                Objects.equals(firstName, player.firstName) &&
                Objects.equals(lastName, player.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, score);
    }
}
