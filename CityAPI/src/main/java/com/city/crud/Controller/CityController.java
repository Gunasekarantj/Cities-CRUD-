package com.city.crud.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.city.crud.Entity.CityEntity;
import com.city.crud.ServiceStub.CityServiceStub;
@RestController
@RequestMapping("api/v1")
public class CityController {
	  @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	  public List<CityEntity> list(){
	    return CityServiceStub.list();
	  }
	  @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	  public CityEntity create(@RequestBody CityEntity cityEntity){
	    return CityServiceStub.create(cityEntity);
	  }
	  @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	  public CityEntity get(@PathVariable Long id){
	    return CityServiceStub.get(id);
	  }
	  @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	  public CityEntity update(@PathVariable int id, @RequestBody CityEntity cityEntity){
	    return CityServiceStub.update(id, cityEntity);
	  }
	  @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	  public CityEntity delete(@PathVariable Long id){
	    return CityServiceStub.delete(id);
	  }
}
