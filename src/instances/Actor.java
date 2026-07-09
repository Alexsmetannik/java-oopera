package instances;

import java.util.Objects;

public class Actor extends Person {
    public Integer height;

    public Actor(String name, String surname, Gender gender, Integer height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Имя = " + name + ", Фамилия = " + surname + " (рост = " + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                Objects.equals(gender, actor.gender) &&
                Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
