package instances;

import java.util.List;

public class MusicalShow extends Show {
    public Person musicAuthor;
    public String librettoText;

    public MusicalShow(String title, Integer duration, Director director, List<Actor> listOfActors, Person musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.print("Текст либретто спектакля " + title + ": " + librettoText);
    }
}
