package org.example.jaxbMedium;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbWriter {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Persons.class);
            Marshaller m = context.createMarshaller();

            Persons persons = new Persons() {
                Person.Address address = new Person.Address("Russia", "Saratov", "Vavilova");
                Person person = new Person("neo21", "Timur", "MehMat", address);
            };


        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
