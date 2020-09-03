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
	private Integer api_id;
	
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
	public Integer getApi_id() {
		return api_id;
	}
	public void setApi_id(Integer api_id) {
		this.api_id = api_id;
	}
	public FavoriteList(Long id, String title, Integer runtime, String vote_average, Integer api_id) {
		super();
		this.id = id;
		this.title = title;
		this.runtime = runtime;
		this.vote_average = vote_average;
		this.api_id = api_id;
	}
	
	
	
	@Override
	public String toString() {
		return "FavoriteList [id=" + id + ", title=" + title + ", runtime=" + runtime + ", vote_average=" + vote_average
				+ ", api_id=" + api_id + "]";
	}
	public FavoriteList() {
		
	}
	

}
