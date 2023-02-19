import java.util.ArrayList;
import java.util.List;
public class Main {
    protected static List<Person> generateClient() {
        Person person = new Person();
        List<Person> list = new ArrayList<>();
        person.name = "Petya";
        person.lastName = "Smirnoff";
        person.numberTickets = 5;
        list.add(person);
        //--------------------------------
        person.name = "Masha";
        person.lastName = "Mishkina";
        person.numberTickets = 3;
        list.add(person);
        //--------------------------------
        person.name = "Dima";
        person.lastName = "Petrov";
        person.numberTickets = 1;
        list.add(person);
        //--------------------------------
        person.name = "Katya";
        person.lastName = "Bulkina";
        person.numberTickets = 4;
        list.add(person);
        //--------------------------------
        person.name = "Dunya";
        person.lastName = "Burlakova";
        person.numberTickets = 2;
        list.add(person);
        //--------------------------------
        return list;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}