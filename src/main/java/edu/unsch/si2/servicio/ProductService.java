/**
 * Created on Oct 24, 2011
 */
package edu.unsch.si2.servicio;

import edu.unsch.si2.dominio.Person;
import edu.unsch.si2.dominio.Product;
import edu.unsch.si2.persistencia.PersonMapper;
import edu.unsch.si2.persistencia.ProductMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Clarence
 *
 */
@Service
@Repository
public class  ProductService {

	private Log log = LogFactory.getLog(ProductService.class);	
	
	@Autowired
	private ProductMapper productMapper;
	@Autowired
        private PersonMapper personmapper; 
	

    

 
    @Transactional
    public void save(Product p) {
       productMapper.insertProduct(p);
    }
    
    @Transactional
    public void savepap(Product p, Person p1) {
       productMapper.insertProduct(p);
       personmapper.insertPerson(p1);
    }

   
	
	
}

