package org.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="transport")
public class Transport {

	@Id
	@Column(name="VehicalName")
	/*@NotEmpty(message = "Please provide a hotel name")*/
	private String vname;
	
	@Column(name="Seats")
	/*@NotEmpty(message = "Please provide a user name")*/
	private String seats;
	
	@Column(name="type")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String type;
	
	@Column(name="price")
	/*@NotEmpty(message = "Please provide a rating for hotel")*/
	private String price;
	
	@Lob
    @Column(name = "photo", columnDefinition="BLOB")	
    private byte[] photo;
	
	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
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
