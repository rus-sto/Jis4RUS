package by.jrr.ruslan.service;

import by.jrr.ruslan.bean.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DogService {
    private Dog dog;
    private Logger logger = LoggerFactory.getLogger(by.jrr.ruslan.service.DogService.class);

    public DogService(Dog dog) {
        this.dog = dog;
    }
    public boolean ifBig (Dog dog) {
        logger.info("Checking if dog is big");
        return dog.getWeight() >= 30;
    }
    public String bark(){

        if (ifBig (this.dog)) {
           return "Dog say - HAU-HAU";
        } else {
            return "Dog say - tyaf-tyaf";
        }
    }
}
