package practice.example.entity;

import practice.example.entity.base.BaseEntity;

import java.util.Objects;


public class User extends BaseEntity {

    private static long counter = 0;

    {
        this.id = ++counter;
    }


    private String name;

    private String phoneNumber;

    public User (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(phoneNumber, user.phoneNumber);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
