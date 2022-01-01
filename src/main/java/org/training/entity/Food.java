package org.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="food")
public class Food {

	@Id
	@Column(name="Foodname")
	/*@NotEmpty(message = "Please provide a hotel name")*/
	private String foodname;
	
	@Column(name="Plates")
	/*@NotEmpty(message = "Please provide a user name")*/
	private String plates;
	
	@Column(name="type")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String type;
	
	@Column(name="price")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String price;
	
	@Lob
    @Column(name = "photo", columnDefinition="BLOB")	
    private byte[] photo;

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getPlates() {
		return plates;
	}

	public void setPlates(String plates) {
		this.plates = plates;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	

}
