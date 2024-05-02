package org.example;



public class User {

    private long id;

    private String firstName;

    private int age;

    private String gender;

    private String address;

    public User() {
    }

    public User(long id, String firstName, int age, String gender, String address) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // определить совершеннолетие
    // Метод для проверки, является ли пользователь мужчиной
    // Метод для проверки, является ли пользователь женщиной
    // Метод для проверки, начинается ли имя пользователя с определенной буквы
    // Метод для проверки заканчивается ли адрес пользователя определенными буквами
    // Метод для проверки содержит ли адрес определенную подстроку
    // Метод для проверки, является ли возраст четным
    public boolean isAgeMore18() {
        System.out.println(this);
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUserMan() {
        if (gender == "man") {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUserWoman() {
        if (gender == "woman") {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUserFioStartWith() {
        if (firstName.startsWith("М")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAddressEndWith() {
        if (address.endsWith("ская")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAddressHave() {
        if (address.contains("бург")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAgeHonest() {
        if (age % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    }

