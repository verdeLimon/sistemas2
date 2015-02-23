package edu.unsch.si2.servicio;

import edu.unsch.si2.dominio.Album;
import edu.unsch.si2.persistencia.AlbumMapper;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;




@Service
@Repository
//@Transactional
public class AlbumService{

    private static final Logger logger =  Logger.getLogger(AlbumService.class);
    
    @Autowired
    private AlbumMapper albummapper;
    
    
    public void save(Album album) {
       albummapper.insertAlbum(album);
       logger.info("inserted:  = "+album);
    }

    public List<Album> findAll() {
         List<Album> albums = albummapper.findAll();
		return albums;
    }
    public void update(Album album){
        albummapper.updateAlbum(album);
        logger.info("updated: id = "+album);
    }
    public void delete(int id) {
       albummapper.deleteAlbum(id);
    }
  

  
}
