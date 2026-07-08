package instances;

public class Actor extends Person {
    public Integer height;

    public Actor(String name, String surname, Gender gender, Integer height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "Рост = " + height +
                ", Имя = '" + name + '\'' +
                ", Фамилия = '" + surname + '\'' +
                '}';
    }
}
