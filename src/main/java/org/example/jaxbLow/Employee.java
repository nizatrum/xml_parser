package org.example.jaxbLow;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
    private String name;
    private int age;
    private String sex;
    private String number;
    private String mail;
    private String city;

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
    @XmlElement
    public void setSex(String sex) {
        this.sex = sex;
    }
    @XmlElement
    public void setNumber(String number) {
        this.number = number;
    }
    @XmlElement
    public void setMail(String mail) {
        this.mail = mail;
    }
    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getNumber() {
        return number;
    }

    public String getMail() {
        return mail;
    }

    public String getCity() {
        return city;
    }
}
