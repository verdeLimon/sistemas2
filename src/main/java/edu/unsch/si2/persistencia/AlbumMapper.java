
package edu.unsch.si2.persistencia;
import edu.unsch.si2.dominio.Album;
import java.util.List;




public interface AlbumMapper {

 
    public void insertAlbum(Album album);
    public List<Album> findAll();
    public void deleteAlbum(Integer id);
    public void updateAlbum(Album album);

}

