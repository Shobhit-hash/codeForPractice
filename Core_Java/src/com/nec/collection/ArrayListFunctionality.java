package com.nec.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
    
}

public class ArrayListFunctionality {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ram", 25));
        users.add(new User("John", 34));
        users.add(new User("Sam", 29));

        users.forEach(user -> {
            System.out.println("Name:" + user.getName() +",Age :" +user.getAge());
        });
    //sort the user according to their age
    users.sort((user1,user2)->{return user1.getAge()-user2.getAge();});
    
    //another short way
    users.sort(Comparator.comparingInt(User::getAge));
    System.out.println("Person Sort According To Their Age "+users);
    }
}