package co.grandcircus.apicapstone.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
public class Movie {	
	private Integer id;
	private String title;
	private String overview; 
	private String release_date;
	private List<Genre> genres;
	private Double vote_average;
	private String tagline;
	private Integer runtime;
	private String poster_path;
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
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public List<Genre> getGenres() {
		return genres;
	}
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	public Double getVote_average() {
		return vote_average;
	}
	public void setVote_average(Double vote_average) {
		this.vote_average = vote_average;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", overview=" + overview + ", release_date=" + release_date
				+ ", genres=" + genres + ", vote_average=" + vote_average + ", tagline=" + tagline + ", runtime="
				+ runtime + ", poster_path=" + poster_path + "]";
	}
	
	
	
	
	
}
