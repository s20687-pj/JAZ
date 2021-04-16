package pl.pjatk.karkra;

import org.springframework.beans.factory.annotation.Value;

public class User {

    private String name;
    private String surname;
    @Value("${my.costom.random:default value}")
    private String myrandom;

    public void setMyrandom(String myrandom) {
        this.myrandom = myrandom;
    }

    public String getMyrandom() {
        return myrandom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String surname, String myrandom, int price) {
        this.name = name;
        this.surname = surname;
        this.myrandom = myrandom;
        this.price = price;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPrice() {
        return price;
    }

    int price;

    public User(){
        System.out.println("siemano");
    }
}
