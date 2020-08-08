package by.jrr.ruslan.bean;

import java.util.Objects;


public class Dog {

    private String name;
    private int age;
    private int weight;

    public Dog() {
//        No args constructor
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        by.jrr.ruslan.bean.Dog dog = (by.jrr.ruslan.bean.Dog) o;
        return age == dog.age &&
                weight == dog.weight &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

