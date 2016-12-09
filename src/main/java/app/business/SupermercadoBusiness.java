package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;
/**
 * Classe que representa a camada de negócios de SupermercadoBusiness
 * 
 * @generated
 **/
@Service("SupermercadoBusiness")
public class SupermercadoBusiness {


    /**
     * Instância da classe SupermercadoDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("SupermercadoDAO")
    protected SupermercadoDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Supermercado post(final Supermercado entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public Supermercado get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Supermercado result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Supermercado put(final Supermercado entity) throws Exception {
      // begin-user-code  
      // end-user-code
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Supermercado> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Supermercado> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Precos> findPrecos(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<Precos> result = repository.findPrecos(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;    
  }

  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Produtos> listProdutos(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      Page<Produtos> result = repository.listProdutos(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteProdutos(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteProdutos(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }


}