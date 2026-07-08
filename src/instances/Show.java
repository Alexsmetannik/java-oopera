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
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст!");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля: " + director);
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
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " ранее уже был добавлен в спектакль");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " успешно добавлен в спектакль");
        }
    }

    public void replaceActor(Actor actorOld, Actor actorNew) {
        boolean foundActor = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(actorOld.surname)) {
                listOfActors.set(i, actorNew);
                foundActor = true;
                System.out.println("Актёр " + actorOld + " заменён на " + actorNew);
                break;
            }
        }
        if (!foundActor) {
            System.out.println("Актёр " + actorOld + " не найден!");
        }
    }
}
