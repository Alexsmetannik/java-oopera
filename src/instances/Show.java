package instances;

import java.util.List;
import java.util.Objects;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public List<Actor> listOfActors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        System.out.println("В спектакле " + getTitle() + " задействованны актёры: ");
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст!");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля " + getTitle() + ": " + director.getName() + " " + director.getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(title, show.title) && Objects.equals(duration, show.duration)
                && Objects.equals(director, show.director) && Objects.equals(listOfActors, show.listOfActors);
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " ранее уже был добавлен в спектакль " + getTitle());
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " успешно добавлен в спектакль " + getTitle());
        }
    }

    public void replaceActor(Actor actorNew, String surname) {
        boolean foundActor = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                if (listOfActors.contains(actorNew)) {
                    System.out.println("Актёр " + actorNew + " уже задействован в спектакле " + getTitle());
                } else {
                    listOfActors.set(i, actorNew);
                    foundActor = true;
                    System.out.println("Актёр " + surname + " заменён на " + actorNew + " в спектакле " + getTitle());
                }
                break;
            }
        }
        if (!foundActor) {
            System.out.println("Актёр " + surname + " в спектакле " + getTitle() + " не найден!");
        }
    }
}
