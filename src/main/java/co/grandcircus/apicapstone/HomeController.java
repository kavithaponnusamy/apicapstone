package co.grandcircus.apicapstone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.apicapstone.entity.Movie;
import co.grandcircus.apicapstone.services.MovieService;


@Controller
public class HomeController {

	
	@Autowired
	MovieService ms;
	
	@Autowired
	MovieListDao favDao;
	
	// show the list of all the movies
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("movies", ms.getMovies());
		return "index";
	}
	
	// display the details of a particular movie, by passing movie id
	@RequestMapping("/movie-details")
	public String showMovieDetails(Model model, @RequestParam("id") Integer id) {
		model.addAttribute("movie", ms.getMovieById(id));
		return "movie-details";
	}
	
	// adding a movie to the favorites and saving it to the database
	@PostMapping("/movie-details")
	public String addToFavoriteList(FavoriteList newFav, RedirectAttributes redir) {
		favDao.save(newFav);
		redir.addFlashAttribute("message", "Movie added to favorites.");
		return "redirect:/";
	}
	
	// display list of all the favorite movies from database
	@RequestMapping("/favorites")
	public String showFavorites(Model model) {
		model.addAttribute("favorites", favDao.findAll());
		return "favorites";
	}
	
	// remove a favorite movie from the database by passing id
	@RequestMapping("/{id}/delete")
	public String deleteFavorite(@PathVariable("id") Long id, RedirectAttributes redir) {
		favDao.deleteById(id);
		redir.addFlashAttribute("flashmessage", "favorite removed from list");
		return "redirect:/favorites/";
	}

	// giving genre choices to select the movies from API
	@RequestMapping("/genre-list")
	public String showGenres(Model model) {
		model.addAttribute("genres", ms.getAllGenres());
		return "genre-list";
	}
	
	//display the list of movies for the passed genre
	@PostMapping("/genre-list")
	public String submitGenre(Model model, @RequestParam("genres") Integer genres) {
		model.addAttribute("genres", ms.getAllGenres());//added to load the genres again
		model.addAttribute("movies", ms.getMoviesByGenre(genres));
		return "genre-list";
	}
	// filter and display the movies by vote average
	@RequestMapping("/search-result-vote")
	public String searchByVote(Model model,@RequestParam(required=false) Double vote_average) {
		List<Movie> temp=ms.getMovies();
		List<Movie> movies=new ArrayList<>();
		for(int i=0;i<temp.size();i++) {
			if(temp.get(i).getVote_average()>vote_average-1 && temp.get(i).getVote_average()<vote_average+1){
				movies.add(ms.getMovieById(temp.get(i).getId()));
			}
		}
		model.addAttribute("movies",movies);
		return "result";
	}
	
	//filter and display the movies by length of the movie
	@RequestMapping("/search-result-length")
	public String searchByLength(Model model,@RequestParam(required=false) Integer runtime) {
		List<Movie> temp=ms.getMovies();
		Movie m=null;
		List<Movie> movies=new ArrayList<>();
		for(int i=0;i<temp.size();i++) {
			 m=ms.getMovieById(temp.get(i).getId());
			if(m.getRuntime()>=runtime-10 && m.getRuntime()<runtime+10){
					movies.add(m);
			}
		}
		model.addAttribute("movies",movies);
		return "result";
	}
}
