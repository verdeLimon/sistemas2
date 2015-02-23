/**
 * Created on Oct 24, 2011
 */
package edu.unsch.si2.persistencia;

import java.util.List;

import edu.unsch.si2.dominio.ContactTelDetail;

/**
 * @author Clarence
 *
 */
public interface ContactTelDetailMapper {

	public List<ContactTelDetail> selectTelDetailForContact(Long contactId);
	
	public void insertContactTelDetail(ContactTelDetail contactTelDetail);
	
	public void updateContactTelDetail(ContactTelDetail contactTelDetail);
	
	public void deleteOrphanContactTelDetail(List<Long> ids);
	
	public void deleteTelDetailForContact(Long contactId);	
	
}
