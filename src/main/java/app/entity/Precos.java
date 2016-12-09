package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

/**
 * Classe que representa a tabela PRECOS
 * @generated
 */
@Entity
@Table(name = "\"PRECOS\""
)
@XmlRootElement
public class Precos implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1896244202l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = false, unique = false, insertable=true, updatable=true)
  private Date data;
  /**
   * @generated
   */
  @Column(name = "preco", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Integer preco;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_produtos", referencedColumnName = "id", insertable=true, updatable=true)
  private Produtos produtos;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_supermercado", referencedColumnName = "id", insertable=true, updatable=true)
  private Supermercado supermercado;
  
  /**
   * Construtor
   * @generated
   */
  public Precos(){
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
  public Precos setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém data
   * @param data data
   * return data
   * @generated
   */
  public Date getData(){
    return this.data;
  }
  
  /**
   * Define data
   * @param data data
   * @generated
   */
  public Precos setData(Date data){
    this.data = data;
    return this;
  }
  
  /**
   * Obtém preco
   * @param preco preco
   * return preco
   * @generated
   */
  public java.lang.Integer getPreco(){
    return this.preco;
  }
  
  /**
   * Define preco
   * @param preco preco
   * @generated
   */
  public Precos setPreco(java.lang.Integer preco){
    this.preco = preco;
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
  public Precos setProdutos(Produtos produtos){
    this.produtos = produtos;
    return this;
  }
  
  /**
   * Obtém supermercado
   * @param supermercado supermercado
   * return supermercado
   * @generated
   */
  public Supermercado getSupermercado(){
    return this.supermercado;
  }
  
  /**
   * Define supermercado
   * @param supermercado supermercado
   * @generated
   */
  public Precos setSupermercado(Supermercado supermercado){
    this.supermercado = supermercado;
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
      
      if(!(obj instanceof Precos))
        return false;
      
      Precos other = (Precos)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}