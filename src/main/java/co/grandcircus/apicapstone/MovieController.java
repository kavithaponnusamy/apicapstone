package co.grandcircus.apicapstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
@Controller
public class MovieController {
	
	@Autowired
	private MovieListDao dao;
	
	@Autowired
	private ApiService apiServ;
	
	/*@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/")
	public String showMovies(Model model) {
		MovieList movie=apiServ.movieList();
		//String title=movie.getTitle();
		model.addAttribute("movie",movie);
		System.out.println(movie);
		System.out.println(movie.getResults().get(1));
		return "result";
	}
*/


