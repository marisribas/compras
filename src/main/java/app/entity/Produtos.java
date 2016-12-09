package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela PRODUTOS
 * @generated
 */
@Entity
@Table(name = "\"PRODUTOS\""
)
@XmlRootElement
public class Produtos implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -939098924l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "produto", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String produto;
  /**
   * @generated
   */
  @Column(name = "quantidade", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Integer quantidade;
  
  /**
   * Construtor
   * @generated
   */
  public Produtos(){
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
  public Produtos setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém produto
   * @param produto produto
   * return produto
   * @generated
   */
  public java.lang.String getProduto(){
    return this.produto;
  }
  
  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public Produtos setProduto(java.lang.String produto){
    this.produto = produto;
    return this;
  }
  
  /**
   * Obtém quantidade
   * @param quantidade quantidade
   * return quantidade
   * @generated
   */
  public java.lang.Integer getQuantidade(){
    return this.quantidade;
  }
  
  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public Produtos setQuantidade(java.lang.Integer quantidade){
    this.quantidade = quantidade;
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
      
      if(!(obj instanceof Produtos))
        return false;
      
      Produtos other = (Produtos)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}