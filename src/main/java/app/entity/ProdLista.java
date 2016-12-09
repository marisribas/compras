package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela PRODLISTA
 * @generated
 */
@Entity
@Table(name = "\"PRODLISTA\""
)
@XmlRootElement
public class ProdLista implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 914454059l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "quantidade", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String quantidade;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_lista", referencedColumnName = "id", insertable=true, updatable=true)
  private Lista lista;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_produtos", referencedColumnName = "id", insertable=true, updatable=true)
  private Produtos produtos;
  
  /**
   * Construtor
   * @generated
   */
  public ProdLista(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public ProdLista setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém quantidade
   * @param quantidade quantidade
   * return quantidade
   * @generated
   */
  public java.lang.String getQuantidade(){
    return this.quantidade;
  }
  
  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public ProdLista setQuantidade(java.lang.String quantidade){
    this.quantidade = quantidade;
    return this;
  }
  
  /**
   * Obtém lista
   * @param lista lista
   * return lista
   * @generated
   */
  public Lista getLista(){
    return this.lista;
  }
  
  /**
   * Define lista
   * @param lista lista
   * @generated
   */
  public ProdLista setLista(Lista lista){
    this.lista = lista;
    return this;
  }
  
  /**
   * Obtém produtos
   * @param produtos produtos
   * return produtos
   * @generated
   */
  public Produtos getProdutos(){
    return this.produtos;
  }
  
  /**
   * Define produtos
   * @param produtos produtos
   * @generated
   */
  public ProdLista setProdutos(Produtos produtos){
    this.produtos = produtos;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof ProdLista))
        return false;
      
      ProdLista other = (ProdLista)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}