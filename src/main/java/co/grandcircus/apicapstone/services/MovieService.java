package co.grandcircus.apicapstone.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.apicapstone.entity.Genre;
import co.grandcircus.apicapstone.entity.GenreResponse;
import co.grandcircus.apicapstone.entity.Movie;
import co.grandcircus.apicapstone.entity.MovieResponse;

@Service
public class MovieService {
	
	RestTemplate rt = new RestTemplate();

	public List<Movie> getMovies() {
		String url ="https://api.themoviedb.org/3/movie/now_playing?api_key=59dc340e2f77e64f2528ec302a03a8f6&language=en-US&page=1";
		return rt.getForObject(url, MovieResponse.class).getResults();
	}
	
	
	public Movie getMovieById(Integer id) {
		String url ="https://api.themoviedb.org/3/movie/" + id + "?api_key=59dc340e2f77e64f2528ec302a03a8f6&language=en-US";
		return rt.getForObject(url, Movie.class);
	}
	
	public List<Genre> getAllGenres(){
		String url ="https://api.themoviedb.org/3/genre/movie/list?api_key=59dc340e2f77e64f2528ec302a03a8f6&language=en-US";
		return rt.getForObject(url, GenreResponse.class).getGenres();
	}
	
	public List<Movie> getMoviesByGenre(Integer id) {
		String url ="https://api.themoviedb.org/3/discover/movie?api_key=59dc340e2f77e64f2528ec302a03a8f6&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&with_genres=" + id;
		return rt.getForObject(url, MovieResponse.class).getResults();
	}
}

