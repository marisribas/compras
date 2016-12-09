package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Supermercado
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Supermercado")
public class SupermercadoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("SupermercadoBusiness")
  private SupermercadoBusiness supermercadoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ProdutosBusiness")
  private ProdutosBusiness produtosBusiness;
  /**
   * @generated
   */
  @Autowired
  @Qualifier("PrecosBusiness")
  private PrecosBusiness precosBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Supermercado post(@Validated @RequestBody final Supermercado entity) throws Exception {
    return supermercadoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Supermercado put(@Validated @RequestBody final Supermercado entity) throws Exception {
    return supermercadoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
  public Supermercado put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Supermercado entity) throws Exception {
    return supermercadoBusiness.put(entity);
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  public void delete(@PathVariable("id") java.lang.String id) throws Exception {
    supermercadoBusiness.delete(id);
  }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Supermercado>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(supermercadoBusiness.list(pageable   )), HttpStatus.OK);    
  }



  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Precos")    
  public HttpEntity<PagedResources<Precos>> findPrecos(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(supermercadoBusiness.findPrecos(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Precos/{relationId}")    
  public void deletePrecos(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.precosBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/Precos/{relationId}")
  public Precos putPrecos(@Validated @RequestBody final Precos entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
    return this.precosBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/Precos")
  public Precos postPrecos(@Validated @RequestBody final Precos entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
  Supermercado supermercado = this.supermercadoBusiness.get(instanceId);
  entity.setSupermercado(supermercado);
    return this.precosBusiness.post(entity);
  }   



  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Produtos")
  public HttpEntity<PagedResources<Produtos>> listProdutos(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(supermercadoBusiness.listProdutos(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Produtos")
  public Supermercado postProdutos(@Validated @RequestBody final Produtos entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
    Precos newPrecos = new Precos();

    Supermercado instance = this.supermercadoBusiness.get(instanceId);

    newPrecos.setProdutos(entity);
    newPrecos.setSupermercado(instance);
    
    this.precosBusiness.post(newPrecos);

    return newPrecos.getSupermercado();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Produtos/{relationId}")
  public void deleteProdutos(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
    this.supermercadoBusiness.deleteProdutos(instanceId, relationId);
  }  




  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Supermercado get(@PathVariable("id") java.lang.String id) throws Exception {
    return supermercadoBusiness.get(id);
  }
}