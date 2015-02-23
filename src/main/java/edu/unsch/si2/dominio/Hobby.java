/**
 * Created on Oct 24, 2011
 */
package edu.unsch.si2.dominio;

import java.io.Serializable;

/**
 * @author Clarence
 *
 */
public class Hobby implements Serializable {

	private String hobbyId;

	public String getHobbyId() {
		return hobbyId;
	}

	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}
	
        @Override
	public String toString() {
		return "Hobby :" + getHobbyId();
	}
	
}
