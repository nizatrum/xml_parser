package org.example.jaxbMedium;


import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person",
        propOrder = { "login", "name", "faculty", "address" })

public class Person {
    public Person() { }

    public Person(String login, String name, String faculty, Address address) {
        this.login = login;
        this.name = name;
        this.faculty = faculty;
        this.address = address;
    }

    @XmlElement(required = true)
    private String login;
    @XmlElement(required = true)
    private String name;
    @XmlElement(required = true)
    private String faculty;
    @XmlElement(required = true)
    private Address address = new Address();

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", address=" + address +
                '}';
    }

    //внутренний класс
    @XmlRootElement
    @XmlType(name = "address", propOrder = { "country", "city", "street" })
    public static class Address {
        private String country;
        private String city;
        private String street;

        public Address() { }

        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }

        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getStreet() {
            return street;
        }
        public void setStreet(String street) {
            this.street = street;
        }
        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }
}
