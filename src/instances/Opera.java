package instances;

import java.util.List;

public class Opera extends MusicalShow {
    public Integer choirSize;

    public Opera(String title, Integer duration, Director director, List<Actor> listOfActors, Person musicAuthor,
                 String librettoText, Integer choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
