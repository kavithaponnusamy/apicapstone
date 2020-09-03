package co.grandcircus.apicapstone;

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
	private ApiService apiServ;
	
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
	/*@GetMapping("/result")
	public String searchBy(Model model) {
		MovieList movie=apiServ.movieList();
		model.addAttribute("movie",movie);
		return "result";
	}*/
}
