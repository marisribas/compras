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
 * Controller para expor serviços REST de Produtos
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Produtos")
public class ProdutosREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ProdutosBusiness")
  private ProdutosBusiness produtosBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("SupermercadoBusiness")
  private SupermercadoBusiness supermercadoBusiness;
  /**
   * @generated
   */
  @Autowired
  @Qualifier("ListaBusiness")
  private ListaBusiness listaBusiness;
  /**
   * @generated
   */
  @Autowired
  @Qualifier("PrecosBusiness")
  private PrecosBusiness precosBusiness;
  /**
   * @generated
   */
  @Autowired
  @Qualifier("ProdListaBusiness")
  private ProdListaBusiness prodListaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Produtos post(@Validated @RequestBody final Produtos entity) throws Exception {
    return produtosBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Produtos put(@Validated @RequestBody final Produtos entity) throws Exception {
    return produtosBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
  public Produtos put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Produtos entity) throws Exception {
    return produtosBusiness.put(entity);
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  public void delete(@PathVariable("id") java.lang.String id) throws Exception {
    produtosBusiness.delete(id);
  }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Produtos>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(produtosBusiness.list(pageable   )), HttpStatus.OK);    
  }



  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Precos")    
  public HttpEntity<PagedResources<Precos>> findPrecos(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(produtosBusiness.findPrecos(instanceId,  pageable )), HttpStatus.OK);
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
  Produtos produtos = this.produtosBusiness.get(instanceId);
  entity.setProdutos(produtos);
    return this.precosBusiness.post(entity);
  }   



  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/ProdLista")    
  public HttpEntity<PagedResources<ProdLista>> findProdLista(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(produtosBusiness.findProdLista(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ProdLista/{relationId}")    
  public void deleteProdLista(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.prodListaBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/ProdLista/{relationId}")
  public ProdLista putProdLista(@Validated @RequestBody final ProdLista entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
    return this.prodListaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/ProdLista")
  public ProdLista postProdLista(@Validated @RequestBody final ProdLista entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
  Produtos produtos = this.produtosBusiness.get(instanceId);
  entity.setProdutos(produtos);
    return this.prodListaBusiness.post(entity);
  }   



  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Supermercado")
  public HttpEntity<PagedResources<Supermercado>> listSupermercado(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(produtosBusiness.listSupermercado(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Supermercado")
  public Produtos postSupermercado(@Validated @RequestBody final Supermercado entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
    Precos newPrecos = new Precos();

    Produtos instance = this.produtosBusiness.get(instanceId);

    newPrecos.setSupermercado(entity);
    newPrecos.setProdutos(instance);
    
    this.precosBusiness.post(newPrecos);

    return newPrecos.getProdutos();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Supermercado/{relationId}")
  public void deleteSupermercado(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
    this.produtosBusiness.deleteSupermercado(instanceId, relationId);
  }  



  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Lista")
  public HttpEntity<PagedResources<Lista>> listLista(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(produtosBusiness.listLista(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Lista")
  public Produtos postLista(@Validated @RequestBody final Lista entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
    ProdLista newProdLista = new ProdLista();

    Produtos instance = this.produtosBusiness.get(instanceId);

    newProdLista.setLista(entity);
    newProdLista.setProdutos(instance);
    
    this.prodListaBusiness.post(newProdLista);

    return newProdLista.getProdutos();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Lista/{relationId}")
  public void deleteLista(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
    this.produtosBusiness.deleteLista(instanceId, relationId);
  }  




  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Produtos get(@PathVariable("id") java.lang.String id) throws Exception {
    return produtosBusiness.get(id);
  }
}