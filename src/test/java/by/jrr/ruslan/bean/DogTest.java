package by.jrr.ruslan.bean;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void getName() {
        Dog dog=new Dog();
        dog.setAge(4);
        dog.setName("Vers");
        dog.setWeight(55);

        String expected ="Vers";
        String actual = dog.getName();
        assertEquals  (expected,actual);
    }

    @Test
    public void getAge() {
        Dog dog=new Dog();
        dog.setAge(4);
        dog.setName("Vers");
        dog.setWeight(55);

        int expected =4;
        int actual = dog.getAge();
        assertEquals  (expected,actual);
    }

    @Test
    public void getWeight() {
        Dog dog=new Dog();
        dog.setAge(4);
        dog.setName("Vers");
        dog.setWeight(55);

        int expected =55;
        int actual = dog.getWeight();
        assertEquals  (expected,actual);
    }

    @Test
    public void testEquals() {
        Dog dog1=new Dog();
        dog1.setAge(4);
        dog1.setName("Vers");
        dog1.setWeight(55);
        Dog dog2=new Dog();
        dog2.setAge(4);
        dog2.setName("Vers");
        dog2.setWeight(55);

        boolean expected =true;
        boolean actual = dog1.equals(dog2);
        assertEquals  (expected,actual);
    }

    @Test
    public void testHashCode() {
        Dog dog=new Dog();
        dog.setAge(4);
        dog.setName("Vers");
        dog.setWeight(55);
        System.out.println("dog.HashCode = " + dog.hashCode());

        int expected =-1736048030;
        int actual = dog.hashCode();
        assertEquals  (expected,actual);
    }

    @Test
    public void testToString() {
        Dog dog=new Dog();
        dog.setAge(4);
        dog.setName("Vers");
        dog.setWeight(55);
        System.out.println("dog.toString() = " + dog.toString());


        String expected = "Dog{name='Vers', age=4, weight=55}";
        String actual = dog.toString();
        assertEquals  (expected,actual);
    }
}