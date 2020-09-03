package co.grandcircus.apicapstone;

import java.util.List;

public class GenreResponse {
	
	private List<Genres> genres;

	public List<Genres> getGenres() {
		return genres;
	}

	public void setGenres(List<Genres> genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "GenreResponse [genres=" + genres + "]";
	}
	

}
