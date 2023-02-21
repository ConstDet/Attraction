import java.util.*;

public class Main {
    protected static List<Person> generateClient() {
        List<Person> list = new ArrayList<>();
        Person person0 = new Person("Petya", "Smirnoff", 5);
        list.add(person0);
        Person person1 = new Person("Masha", "Mishkina", 3);
        list.add(person1);
        Person person2 = new Person("Dima", "Petrov", 1);
        list.add(person2);
        Person person3 = new Person("Katya", "Bulkina", 4);
        list.add(person3);
        Person person4 = new Person("Dunya", "Burlakova", 2);
        list.add(person4);
        return list;
    }
    public static void main(String[] args) {
        Deque<Person> dequePerson = new ArrayDeque<>();

        for (int i = 0; i < generateClient().size(); i++) {
            dequePerson.offer(generateClient().get(i));
        }

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