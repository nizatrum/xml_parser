package org.example.jaxbMedium;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JaxbReader {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
            Unmarshaller u = jaxbContext.createUnmarshaller();
            FileReader fileReader = new FileReader("src/main/java/org/example/jaxbMedium/person.xml");
            Persons persons = (Persons) u.unmarshal(fileReader);
            System.out.println(persons);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
