package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela SUPERMERCADO
 * @generated
 */
@Entity
@Table(name = "\"SUPERMERCADO\""
)
@XmlRootElement
public class Supermercado implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1700478581l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "supermercado", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String supermercado;
  /**
   * @generated
   */
  @Column(name = "local", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String local;
  
  /**
   * Construtor
   * @generated
   */
  public Supermercado(){
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
  public Supermercado setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém supermercado
   * @param supermercado supermercado
   * return supermercado
   * @generated
   */
  public java.lang.String getSupermercado(){
    return this.supermercado;
  }
  
  /**
   * Define supermercado
   * @param supermercado supermercado
   * @generated
   */
  public Supermercado setSupermercado(java.lang.String supermercado){
    this.supermercado = supermercado;
    return this;
  }
  
  /**
   * Obtém local
   * @param local local
   * return local
   * @generated
   */
  public java.lang.String getLocal(){
    return this.local;
  }
  
  /**
   * Define local
   * @param local local
   * @generated
   */
  public Supermercado setLocal(java.lang.String local){
    this.local = local;
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
      
      if(!(obj instanceof Supermercado))
        return false;
      
      Supermercado other = (Supermercado)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}