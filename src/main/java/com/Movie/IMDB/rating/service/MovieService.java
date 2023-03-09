package com.Movie.IMDB.rating.service;

import com.Movie.IMDB.rating.model.Movie;
import com.Movie.IMDB.rating.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Here we are connecting service with springboot class.
@Service
public class MovieService {
    private MovieRepository movieRepository;

    // Here we are autowiring so that this classes using the functionality of the movierepository.
    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String saveMovie(Movie movie) {
        Movie savedMovie = movieRepository.save(movie);
        return "New Movie Created: " + savedMovie;
    }

    public List<Movie> getMovieList() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id);
    }


    public Movie deleteById(int id) {
        return movieRepository.deleteById(id);
    }


    public long movieCount() {
        return movieRepository.count();
    }

    public boolean checkById(int id) {
        return movieRepository.existsById(id);
    }

    public String deleteAllMovie() {
        movieRepository.deleteAll();
        return "All Movies Deleted";
    }


}
