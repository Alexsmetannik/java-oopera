package instances;

public class Director extends Person {
    public Integer numberOfShows;

    public Director(String name, String surname, Gender gender, Integer numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Имя = " + name + ", Фамилия = " + surname
                + " (количество поставленных спектаклей = " + numberOfShows + ")";
    }
}
