import java.util.*;

public class Main {
    protected static List<Person> generateClient() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Petya", "Smirnoff", 5));
        list.add(new Person("Masha", "Mishkina", 3));
        list.add(new Person("Dima", "Petrov", 1));
        list.add(new Person("Katya", "Bulkina", 4));
        list.add(new Person("Dunya", "Burlakova", 2));
        return list;
    }
    public static void main(String[] args) {
        Deque<Person> dequePerson = new ArrayDeque<>();

        dequePerson.addAll(generateClient());

        while (!dequePerson.isEmpty()) {
            Person person = dequePerson.pollFirst();//вытащим первого в очереди
            if (person.getNumberTickets() > 1) {//два и более билета, то прокатим еще раз и в очередь
                person.consumptionTicket();//забрали один билет
                dequePerson.offerLast(person);//обратно в очередь
            } else if (person.getNumberTickets() == 1) {//прокатим еще раз и удалим из очереди
                person.consumptionTicket();//забрали один билет
            }
            System.out.println(person.toString());
        }
        System.out.println("Всех покатали, очередь закончилась!");
    }
}