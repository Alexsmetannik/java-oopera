package instances;

import java.util.List;

public class Show {
    public String title;
    public Integer duration;
    public Director director;
    public List<Actor> listOfActors;

    public Show(String title, Integer duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
}
