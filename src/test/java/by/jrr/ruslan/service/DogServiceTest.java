package by.jrr.ruslan.service;

import by.jrr.ruslan.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogServiceTest {

    @Test
    public void ifBigTestShouldReturnTrue() {
        Dog dog=new Dog();
        dog.setWeight(55);
        DogService dogService=new DogService(dog);

        boolean expected = true;
        boolean actual = dogService.ifBig(dog);
        assertEquals  ( expected,actual);
    }
    @Test
    public void ifBigTestShouldReturnFalse() {
        Dog dog=new Dog();
        dog.setWeight(25);
        DogService dogService=new DogService(dog);

        boolean expected = false;
        boolean actual = dogService.ifBig(dog);
        assertEquals  ( expected,actual);
    }


    @Test
    public void barkTestBigDogTrue() {
        Dog dog = new Dog();
        dog.setWeight(55);
        DogService dogService=new DogService(dog);

        String actual =dogService.bark();
        String expected = "Dog say - HAU-HAU";
        assertEquals(expected,actual);
    }

    @Test
    public void barkTestSmallDogTrue() {
        Dog dog = new Dog();
        dog.setWeight(15);
        DogService dogService=new DogService(dog);

        String actual =dogService.bark();
        String expected = "Dog say - tyaf-tyaf";
        assertEquals(expected,actual);
    }

}