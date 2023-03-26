package org.example.jaxbMedium;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Persons {
    @XmlElement(name = "person")
    private ArrayList<Person> listPerson = new ArrayList<>();

    public Persons() { }

    public boolean addPerson(Person person) {
        return listPerson.add(person);
    }

    @Override
    public String toString() {
        return "Persons{" +
                "listPerson=" + listPerson +
                '}';
    }
}
