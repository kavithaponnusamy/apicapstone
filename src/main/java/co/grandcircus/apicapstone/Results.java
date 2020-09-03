package co.grandcircus.apicapstone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Results {
	private Integer id;
	private String title;
	private String overview;
	private Double vote_average;
	private Double popularity;
	private List<Integer> genre_ids;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public Double getVote_average() {
		return vote_average;
	}
	public void setVote_average(Double vote_average) {
		this.vote_average = vote_average;
	}
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	public List<Integer> getGenre_ids() {
		return genre_ids;
	}
	public void setGenre_ids(List<Integer> genre_ids) {
		this.genre_ids = genre_ids;
	}
	@Override
	public String toString() {
		return "Results [id=" + id + ", title=" + title + ", overview=" + overview + ", vote_average=" + vote_average
				+ ", popularity=" + popularity + ", genre_Ids=" + genre_ids + "]";
	}
	
	
}
