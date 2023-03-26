package org.example.jaxbLow;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {
    public static void main(String[] args) {
        String fileUrl = "src/main/java/org/example/jaxb/Employee.xml";
        File file = new File(fileUrl);

        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Employee employeeCreateAfterReader = (Employee) unmarshaller.unmarshal(file);
            System.out.println(employeeCreateAfterReader.getName());
            System.out.println(employeeCreateAfterReader.getAge());
            System.out.println(employeeCreateAfterReader.getSex());
            System.out.println(employeeCreateAfterReader.getNumber());
            System.out.println(employeeCreateAfterReader.getMail());
            System.out.println(employeeCreateAfterReader.getCity());

        } catch (JAXBException e) {
            e.printStackTrace();

        }
    }
}
