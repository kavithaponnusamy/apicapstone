package co.grandcircus.apicapstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MovieController {
	
	@Autowired
	private MovieListDao dao;
	
	@Autowired
	private ApiService apiServ;
	
	@GetMapping("/")
	public String home(Model model) {
		MovieList movie=apiServ.movieList();
		model.addAttribute("movie",movie);
		return "homepage";
	}
	
	@GetMapping("/result")
	public String searchBy(Model model) {
		MovieList movie=apiServ.movieList();
		model.addAttribute("movie",movie);
		return "result";
	}
	@GetMapping("/show-details")
	public String showMovies(Model model, @RequestParam("id") Integer id) {
		//MovieList movie1=apiServ.movieList();
		Results result= apiServ.showDetails(id);		
		System.out.println(result);
		model.addAttribute("result",result);
		return "result";
		
	}
}


