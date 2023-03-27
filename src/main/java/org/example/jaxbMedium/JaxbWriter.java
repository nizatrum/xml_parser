package org.example.jaxbMedium;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JaxbWriter {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Marshaller m = context.createMarshaller();

            Persons persons = new Persons() {
                {
                    Person.Address address = new Person.Address("Russia", "Saratov", "Vavilova");
                    Person person = new Person("neo21", "Timur", "MehMat", address);
                    this.addPerson(person);
                    address = new Person.Address("Canada", "Montreal", "Nooberg street");
                    person = new Person("fnafe", "Finn", "History", address);
                    this.addPerson(person);
                }
            };
            m.marshal(persons, new FileOutputStream("src/main/java/org/example/jaxbMedium/person.xml"));
            System.out.println("File xml is created");

        } catch (JAXBException e) {
            System.out.println("JAXBContext is wrong " + e);
        } catch (FileNotFoundException e) {
            System.out.println("XML file could not be created " + e);
        }
    }
}
