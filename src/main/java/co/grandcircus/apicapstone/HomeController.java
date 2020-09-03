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
	
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("movies", ms.getMovies());
		return "index";
	}
	
	@RequestMapping("/movie-details")
	public String showMovieDetails(Model model, @RequestParam("id") Integer id) {
		model.addAttribute("movie", ms.getMovieById(id));
		return "movie-details";
	}
	
	@PostMapping("/movie-details")
	public String addToFavoriteList(FavoriteList newFav, RedirectAttributes redir) {
		favDao.save(newFav);
		redir.addFlashAttribute("message", "Movie added to favorites.");
		return "redirect:/";
	}
	
	@RequestMapping("/favorites")
	public String showFavorites(Model model) {
		model.addAttribute("favorites", favDao.findAll());
		return "favorites";
	}
	
	@RequestMapping("/{id}/delete")
	public String deleteFavorite(@PathVariable("id") Long id, RedirectAttributes redir) {

		favDao.deleteById(id);
		redir.addFlashAttribute("flashmessage", "favorite removed from list");

		return "redirect:/favorites/";
	}

	
	@RequestMapping("/genre-list")
	public String showGenres(Model model) {
		model.addAttribute("genres", ms.getAllGenres());
		return "genre-list";
	}
	
	@PostMapping("/genre-list")
	public String submitGenre(Model model, @RequestParam("genres") Integer genres) {
		
		model.addAttribute("movies", ms.getMoviesByGenre(genres));
		return "genre-list";
	}

	@RequestMapping("/search-result-vote")
	public String searchByVote(Model model,@RequestParam(required=false) Double vote_average) {
		List<Movie> temp=ms.getMovies();
		List<Movie> movies=new ArrayList<>();
		for(int i=0;i<temp.size();i++) {
			if(temp.get(i).getVote_average()>=vote_average && temp.get(i).getVote_average()<vote_average+1){
				
				//movies.add(temp.get(i));
				movies.add(ms.getMovieById(temp.get(i).getId()));
			}
			
		}
		model.addAttribute("movies",movies);
		return "result";
	}
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
