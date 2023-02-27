package com.Movie.IMDB.rating.repository;

import com.Movie.IMDB.rating.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
    public List<Movie> findAll();
    public Movie findById(int id);




}
