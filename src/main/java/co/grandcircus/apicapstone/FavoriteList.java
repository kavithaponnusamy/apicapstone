package co.grandcircus.apicapstone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FavoriteList {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Integer runtime;
	private String vote_average;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public String getVote_average() {
		return vote_average;
	}
	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}
	

}
