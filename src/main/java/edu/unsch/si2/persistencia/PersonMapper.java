
package edu.unsch.si2.persistencia;
import edu.unsch.si2.dominio.Person;
import java.util.List;




public interface PersonMapper {

 
    public void insertPerson(Person person);
    public List<Person> findAll();
    public void deletePerson(Integer id);

}

