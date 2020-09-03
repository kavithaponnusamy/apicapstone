package co.grandcircus.apicapstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.apicapstone.services.MovieService;

@Controller
public class HomeController {

	@Autowired
	MovieService ms;
	
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
	
}
