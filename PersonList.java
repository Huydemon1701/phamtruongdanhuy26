package personmanagement;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        person.inputInfo();
        people.add(person);
    }

    public void displayList() {
        if (people.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Person p : people) {
                p.displayInfo();
                System.out.println("------------------");
            }
        }
    }
}
