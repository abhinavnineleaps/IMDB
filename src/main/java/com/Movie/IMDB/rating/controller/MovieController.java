package com.Movie.IMDB.rating.controller;

import com.Movie.IMDB.rating.model.Movie;
import com.Movie.IMDB.rating.repository.MovieRepository;
import com.Movie.IMDB.rating.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// WE ARE USING REST API THATS WHY REST CONTROLLER
@RestController

//  This is to the starting version
@RequestMapping("/imdb")

public class MovieController {
    private MovieService movieService;
//    private MovieRepository movieRepository;

    // Here we are autowiring the movie controller to the movie service so that movie controller uses the
// the functionality of the movie service
    @Autowired
    public MovieController(MovieService service)// It is helping us to add movierepository to moviecontroller.
    {
        this.movieService = service; // Creating dependency and wire it.
    }

    // Here we are giving url name and method to implement it.
    @RequestMapping(value = "/movie/save", method = RequestMethod.POST)     // Spring Boot is mapping

    // AB JO HUMNE DATA BODY MAI DALA THA USSE REQUEST KR RHE HAI TAAKI USKO DATA BASES MAI JAKE STORE KR SKE
    // AB JO POSTMAN PE HUMNE DIA THA THA USKO PAYLOAD BOLA HAI MEANS DATA PROVIDED BY THE FRONTEND.

    public String saveMovie(@RequestBody Movie payload) {
        return movieService.saveMovie(payload);
    }

    // Here we are using the logic of the crud repository in movie repository.

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> movieList() {

        return movieService.getMovieList();
    }

    @GetMapping("/movies/{id}")
    public Movie movieById(@PathVariable("id") int id) {
        return movieService.getMovieById(id);
    }

    //This new function from movie repository for the deleteById function

    @RequestMapping(value = "/deleteMovie/{id}", method = RequestMethod.DELETE)
    public Movie deleteById(@PathVariable("id") int id) {
        return movieService.deleteById(id);
    }

    //New function from movie repository for count
    @RequestMapping(value = "/countMovie", method = RequestMethod.GET)
    public long countMovie() {
        return movieService.movieCount();
    }

    //New function from ovie repo for checking the already present  or not

    @RequestMapping(value = "/checkMovieById/{id}", method = RequestMethod.GET)
    public boolean checkMovieById(@PathVariable("id") int id) {
        return movieService.checkById(id);
    }

    @RequestMapping(value = "/deleteAllMovie", method = RequestMethod.DELETE)
    public String deleteAllMovie() {
        return movieService.deleteAllMovie();
    }

}
