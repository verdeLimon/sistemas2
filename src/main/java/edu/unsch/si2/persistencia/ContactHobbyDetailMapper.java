/**
 * Created on Oct 24, 2011
 */
package edu.unsch.si2.persistencia;

import edu.unsch.si2.dominio.ContactHobbyDetail;

/**
 * @author Clarence
 *
 */
public interface ContactHobbyDetailMapper {

	public void insertContactHobbyDetail(ContactHobbyDetail contactHobbyDetail);
	
	public void deleteHobbyDetailForContact(Long contactId);	
	
}
