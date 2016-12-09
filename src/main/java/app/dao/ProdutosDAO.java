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
@Repository("ProdutosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProdutosDAO extends JpaRepository<Produtos, java.lang.String> {

  /**
   * Obtém a instância de Produtos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Produtos entity WHERE entity.id = :id")
  public Produtos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Produtos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Produtos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Produtos c")
  public Page<Produtos> list ( Pageable pageable );
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Precos entity WHERE entity.produtos.id = :id")
  public Page<Precos> findPrecos(@Param(value="id") java.lang.String id,  Pageable pageable );

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ProdLista entity WHERE entity.produtos.id = :id")
  public Page<ProdLista> findProdLista(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.supermercado FROM Precos entity WHERE entity.produtos.id = :id")
  public Page<Supermercado> listSupermercado(@Param(value="id") java.lang.String id,  Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Precos entity WHERE entity.produtos.id = :instanceId AND entity.supermercado.id = :relationId")
  public int deleteSupermercado(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.lista FROM ProdLista entity WHERE entity.produtos.id = :id")
  public Page<Lista> listLista(@Param(value="id") java.lang.String id,  Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ProdLista entity WHERE entity.produtos.id = :instanceId AND entity.lista.id = :relationId")
  public int deleteLista(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);



}