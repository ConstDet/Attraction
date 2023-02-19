import java.util.*;

public class Main {
    protected static List<Person> generateClient() {
        List<Person> list = new ArrayList<>();
        Person person0 = new Person();
        person0.name = "Petya";
        person0.lastName = "Smirnoff";
        person0.numberTickets = 5;
        list.add(person0);
        //--------------------------------
        Person person1 = new Person();
        person1.name = "Masha";
        person1.lastName = "Mishkina";
        person1.numberTickets = 3;
        list.add(person1);
        //--------------------------------
        Person person2 = new Person();
        person2.name = "Dima";
        person2.lastName = "Petrov";
        person2.numberTickets = 1;
        list.add(person2);
        //--------------------------------
        Person person3 = new Person();
        person3.name = "Katya";
        person3.lastName = "Bulkina";
        person3.numberTickets = 4;
        list.add(person3);
        //--------------------------------
        Person person4 = new Person();
        person4.name = "Dunya";
        person4.lastName = "Burlakova";
        person4.numberTickets = 2;
        list.add(person4);
        //--------------------------------
        return list;
    }
    public static void main(String[] args) {
        Deque<Person> dequePerson = new ArrayDeque<>();

        for (int i = 0; i < generateClient().size(); i++) {
            dequePerson.offer(generateClient().get(i));
        }

        while (!dequePerson.isEmpty()) {
            Person person = dequePerson.pollFirst();//вытащим первого в очереди
            if (person.numberTickets > 1) {//два и более билета, то прокатим еще раз и в очередь
                person.numberTickets -= 1;
                dequePerson.offerLast(person);//обратно в очередь
            } else if (person.numberTickets == 1) {//прокатим еще раз и удалим из очереди
                person.numberTickets -= 1;
            }
            System.out.println(person.name + " " + person.lastName +
                    " прокатился на аттракционе! Осталось билетов - " + person.numberTickets);
        }
        System.out.println("Всех покатали, очередь закончилась!");
    }
}