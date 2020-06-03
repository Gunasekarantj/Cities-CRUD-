package com.city.crud.Entity;



public class CityEntity {
	    private int id;
	    private String name;
	    private int pincode;
		public long getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public CityEntity(int id, String name, int pincode) {
			super();
			this.id = id;
			this.name = name;
			this.pincode = pincode;
		}
		public CityEntity() {
			
		}
	    
}
