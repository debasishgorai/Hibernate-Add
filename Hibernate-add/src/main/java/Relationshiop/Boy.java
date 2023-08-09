package Relationshiop;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Boy {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private int bid;
	private String name;
	@ManyToOne
	private Girl g;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Girl getG() {
		return g;
	}
	public void setG(Girl g) {
		this.g = g;
	}
	
	
}
