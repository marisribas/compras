package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 
/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("SupermercadoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface SupermercadoDAO extends JpaRepository<Supermercado, java.lang.String> {

  /**
   * Obtém a instância de Supermercado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Supermercado entity WHERE entity.id = :id")
  public Supermercado findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Supermercado utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Supermercado entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Supermercado c")
  public Page<Supermercado> list ( Pageable pageable );
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Precos entity WHERE entity.supermercado.id = :id")
  public Page<Precos> findPrecos(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.produtos FROM Precos entity WHERE entity.supermercado.id = :id")
  public Page<Produtos> listProdutos(@Param(value="id") java.lang.String id,  Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Precos entity WHERE entity.supermercado.id = :instanceId AND entity.produtos.id = :relationId")
  public int deleteProdutos(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);



}