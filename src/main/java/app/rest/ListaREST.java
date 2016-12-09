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
 * Controller para expor serviços REST de Lista
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Lista")
public class ListaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ListaBusiness")
  private ListaBusiness listaBusiness;

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
  @Qualifier("ProdListaBusiness")
  private ProdListaBusiness prodListaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Lista post(@Validated @RequestBody final Lista entity) throws Exception {
    return listaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Lista put(@Validated @RequestBody final Lista entity) throws Exception {
    return listaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
  public Lista put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Lista entity) throws Exception {
    return listaBusiness.put(entity);
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  public void delete(@PathVariable("id") java.lang.String id) throws Exception {
    listaBusiness.delete(id);
  }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Lista>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(listaBusiness.list(pageable   )), HttpStatus.OK);    
  }



  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/ProdLista")    
  public HttpEntity<PagedResources<ProdLista>> findProdLista(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(listaBusiness.findProdLista(instanceId,  pageable )), HttpStatus.OK);
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
  Lista lista = this.listaBusiness.get(instanceId);
  entity.setLista(lista);
    return this.prodListaBusiness.post(entity);
  }   



  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Produtos")
  public HttpEntity<PagedResources<Produtos>> listProdutos(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(listaBusiness.listProdutos(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Produtos")
  public Lista postProdutos(@Validated @RequestBody final Produtos entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
    ProdLista newProdLista = new ProdLista();

    Lista instance = this.listaBusiness.get(instanceId);

    newProdLista.setProdutos(entity);
    newProdLista.setLista(instance);
    
    this.prodListaBusiness.post(newProdLista);

    return newProdLista.getLista();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Produtos/{relationId}")
  public void deleteProdutos(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
    this.listaBusiness.deleteProdutos(instanceId, relationId);
  }  




  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Lista get(@PathVariable("id") java.lang.String id) throws Exception {
    return listaBusiness.get(id);
  }
}