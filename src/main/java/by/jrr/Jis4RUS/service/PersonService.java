package by.jrr.Jis4RUS.service;

import by.jrr.Jis4RUS.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonService {
    private Person person;
    private Logger logger = LoggerFactory.getLogger(PersonService.class);

    public PersonService(Person person){
        this.person=person;
    }
    public boolean ifAdult(){
        logger.info("Checking if person is adult");
        return person.getAge()>=18;
            }
}
