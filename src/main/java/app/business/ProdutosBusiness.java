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
 * Classe que representa a camada de negócios de ProdutosBusiness
 * 
 * @generated
 **/
@Service("ProdutosBusiness")
public class ProdutosBusiness {


    /**
     * Instância da classe ProdutosDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ProdutosDAO")
    protected ProdutosDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Produtos post(final Produtos entity) throws Exception {
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
    public Produtos get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Produtos result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Produtos put(final Produtos entity) throws Exception {
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
  public Page<Produtos> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Produtos> result = repository.list (  pageable );
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
  public Page<Supermercado> listSupermercado(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      Page<Supermercado> result = repository.listSupermercado(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteSupermercado(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteSupermercado(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Lista> listLista(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      Page<Lista> result = repository.listLista(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteLista(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteLista(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }


}