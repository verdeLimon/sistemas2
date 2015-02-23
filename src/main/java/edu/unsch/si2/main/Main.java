/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unsch.si2.main;

import edu.unsch.si2.dominio.Album;
import edu.unsch.si2.servicio.AlbumService;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author verde
 */
public class Main {
    public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context.xml");
		ctx.refresh();
		
		
                AlbumService albumservice = ctx.getBean(AlbumService.class);
                Album album = new Album();
                //album.setId(2);
                album.setArtist("pumita andy u");
                album.setTitle("la lechuza_u");                
                album.setClassical(false);
                album.setComposer("Josue jurado suritau");
                
                try{
                    for (int i = 1; i <= 10000; i++) {
                        album.setTitle("pumita andy"+i);
                        albumservice.save(album);
                        System.out.println(album);
                    }
                    
                
                System.out.println("--------------------------------PERSON 01----------------------------------");
                System.out.println(album);
                }
                catch(Exception e){
                e.printStackTrace();
                }
                
            
               
	}
	
    
}
