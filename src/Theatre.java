import instances.*;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Сергей", "Безруков", Gender.MALE, 180);
        Actor actor2 = new Actor("Екатерина", "Гусева", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Дмитрий", "Дюжев", Gender.MALE, 175);

        Director director1 = new Director("Никита", "Михалков", Gender.MALE, 15);
        Director director2 = new Director("Константин", "Богомолов", Gender.MALE, 8);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Иван", "Иванов", Gender.MALE);

        Show regularShow = new Show("Три сестры", 180, director1, new ArrayList<>());

        Opera opera = new Opera("Призрак оперы", 210, director1, new ArrayList<>(),
                musicAuthor, "Либретто оперы 'Призрак оперы'", 30);

        Ballet ballet = new Ballet("Лебединое озеро", 150, director2, new ArrayList<>(),
                musicAuthor, "Либретто балета 'Лебединое озеро'", choreographer);


        System.out.println("Распределение актёров по спектаклю " + regularShow.getTitle() + ": ");
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        regularShow.addActor(actor3);
        System.out.println();

        System.out.println("Распределение актёров по спектаклю " + opera.getTitle() + ": ");
        opera.addActor(actor1);
        opera.addActor(actor2);
        System.out.println();

        System.out.println("Распределение актёров по спектаклю " + ballet.getTitle() + ": ");
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.println();

        System.out.println("Список актёров и режиссёров спектактей: ");
        regularShow.printListOfActors();
        regularShow.printDirector();
        System.out.println();

        opera.printListOfActors();
        opera.printDirector();
        System.out.println();

        ballet.printListOfActors();
        ballet.printDirector();
        System.out.println();

        System.out.println("Замена актёров в спектакле " + opera.getTitle() + ": ");
        opera.replaceActor(actor3, "Безруков");
        opera.printListOfActors();
        System.out.println();

        System.out.println("Замена актёров в спектакле " + ballet.getTitle() + ": ");
        ballet.replaceActor(actor2, "Сергеев");
        System.out.println();

        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
        System.out.println();
    }
}
