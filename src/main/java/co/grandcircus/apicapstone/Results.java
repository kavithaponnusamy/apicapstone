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
	//private List<Genre_Ids> genre_Ids;
	private Genre_Ids genre_Ids;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	/*
	public List<Genre_Ids> getGenreIds() {
		return genre_Ids;
	}
	public void setGenre_Ids(List<Genre_Ids> genre_Ids) {
		this.genre_Ids = genre_Ids;		
	}*/
	
	public void setTitle(String title) {
		this.title = title;
	}
	public Genre_Ids getGenre_Ids() {
		return genre_Ids;
	}
	public void setGenre_Ids(Genre_Ids genre_Ids) {
		this.genre_Ids = genre_Ids;
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
	@Override
	public String toString() {
		return "Results [id=" + id + ", title=" + title + ", overview=" + overview + ", vote_average=" + vote_average
				+ ", popularity=" + popularity + ", genre_Ids=" + genre_Ids + "]";
	}

}
