package co.grandcircus.apicapstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ApiService {
	
	private RestTemplate rt;
	
	@Value("${api-key}")
	private String apiKey;
	
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Weather");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public MovieList movieList(){
		String url="https://api.themoviedb.org/4/list/1?page=1&api_key={apiKey}";
			
		
		MovieList movie=rt.getForObject(url, MovieList.class,apiKey);
		
		
		
		return  movie;
	}

}
