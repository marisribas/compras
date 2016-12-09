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
 * Classe que representa a camada de negócios de ListaBusiness
 * 
 * @generated
 **/
@Service("ListaBusiness")
public class ListaBusiness {


    /**
     * Instância da classe ListaDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ListaDAO")
    protected ListaDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Lista post(final Lista entity) throws Exception {
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
    public Lista get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Lista result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Lista put(final Lista entity) throws Exception {
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
  public Page<Lista> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Lista> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<ProdLista> findProdLista(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<ProdLista> result = repository.findProdLista(id,  pageable );
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