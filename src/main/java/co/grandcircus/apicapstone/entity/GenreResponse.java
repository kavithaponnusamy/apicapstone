package co.grandcircus.apicapstone.entity;

import java.util.List;



public class GenreResponse {
	
	private List<Genre> genres;

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "GenreResponse [genres=" + genres + "]";
	}
	

}
