package edu.unsch.si2.servicio;

import edu.unsch.si2.dominio.Person;
import edu.unsch.si2.persistencia.PersonMapper;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;




@Service
@Repository
//@Transactional
public class PersonService{

    private static final Logger logger =  Logger.getLogger(PersonService.class);
    
    @Autowired
    private PersonMapper personmapper;
    
    
    public void save(Person person) {
       personmapper.insertPerson(person);
       logger.info("inserted: id = "+person.getId());
    }

    public List<Person> findAll() {
         List<Person> persons = personmapper.findAll();
		return persons;
    }
    public void delete(int id) {
       personmapper.deletePerson(id);
    }
  

  
}
