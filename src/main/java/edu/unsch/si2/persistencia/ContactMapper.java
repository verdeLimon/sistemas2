/**
 * Created on Oct 24, 2011
 */
package edu.unsch.si2.persistencia;

import java.util.List;

import edu.unsch.si2.dominio.Contact;
import edu.unsch.si2.dominio.SearchCriteria;

/**
 * @author Clarence
 *
 */
public interface ContactMapper {

	public List<Contact> findAll();
	
	public List<Contact> findAllWithDetail();
	
	public Contact findById(Long id);
	
	public List<Contact> findByFirstNameAndLastName(SearchCriteria criteria);	
	
	public void insertContact(Contact contact);
	
	public void updateContact(Contact contact);
	
	public void deleteContact(Long id);
	
}
