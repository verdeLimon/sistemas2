package edu.unsch.si2.servicio;


import edu.unsch.si2.servicio.AlbumService;



/**
 * The {@link AlbumOrganizerService} is the service that is required by the
 * {@link AlbumOrganizerPM}.
 * 
 */
public class AlbumOrganizerService {
	private final AlbumService database;

	public AlbumOrganizerService(AlbumService database) {
		super();
		this.database = database;
	}

	public AlbumService getDatabase() {
		return database;
	}

}
