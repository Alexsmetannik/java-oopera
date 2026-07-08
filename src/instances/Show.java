package instances;

import java.util.List;
import java.util.Objects;

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

    public void printListOfActors() {
        System.out.println("Задействованные актёры: ");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(title, show.title) && Objects.equals(duration, show.duration)
                && Objects.equals(director, show.director) && Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration, director, listOfActors);
    }

    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }

    public void replacementActor(Actor actorOld, Actor actorNew) {
        listOfActors.removeIf(actor1 -> actor1.equals(actorOld));
        listOfActors.add(actorNew);
    }
}
