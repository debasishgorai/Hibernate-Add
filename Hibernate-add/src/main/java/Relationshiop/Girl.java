package Relationshiop;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Girl {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int gid;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Boy>boys;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Boy> getBoys() {
		return boys;
	}
	public void setBoys(List<Boy> boys) {
		this.boys = boys;
	}
}
