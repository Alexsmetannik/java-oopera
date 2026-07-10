package instances;

import java.util.List;

public class MusicalShow extends Show {
    public Person musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors, Person musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto() {
        System.out.print("Текст либретто спектакля " + getTitle() + ": " + getLibrettoText());
    }
}
