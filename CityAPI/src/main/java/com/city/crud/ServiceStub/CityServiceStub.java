package com.city.crud.ServiceStub;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.city.crud.Entity.CityEntity;

public class CityServiceStub {
	private static Map<Integer, CityEntity> cities = new HashMap<Integer, CityEntity>();
	 private static int idIndex = 3;
	  static {
	    CityEntity a = new CityEntity(1, "Madurai",627002);
	    cities.put(1, a);
	    CityEntity b = new CityEntity(2, "Tirunelveli",627008);
	    cities.put(2, b);
	    CityEntity c = new CityEntity(3, "Chennai",600097);
	    cities.put(3, c);
	   
	  }
	  public static List<CityEntity> list() {
	    return new ArrayList<CityEntity>(cities.values());
	  }
	  public static CityEntity create(CityEntity city) {
	    idIndex += idIndex;
	    city.setId(idIndex);
	    cities.put(idIndex, city);
	    return city;
	  }
	  public static CityEntity get(Long id) {
	    return cities.get(id);
	  }
	  public static CityEntity update(int id, CityEntity city) {
	    cities.put(id, city);
	    return city;
	  }
	  public static CityEntity delete(Long id) {
	    return cities.remove(id);
	  }
}
