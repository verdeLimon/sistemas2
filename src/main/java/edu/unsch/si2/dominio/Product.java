package edu.unsch.si2.dominio;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = -1900054678340682193L;
	
	private int id;
	private String brand;
	private String model;
	private String name;
        private int owner;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    /**
     * @return the owner
     */
    public int getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String toString(){
    return "id: "+getId()+" name: "+getName()+" model: "+getModel()+" owner: "+getOwner();
    }
}
