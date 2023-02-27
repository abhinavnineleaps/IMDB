package com.Movie.IMDB.rating;

public class Movie {
    private int id;
    private String movieName;
    private String movieDescription;

    public Movie(int id, String movieName, String movieDescription) {
        // This keyword is refer to the current context of java class class
        this.id = id;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
    }

    // Getters are for getting the details and Setters are for assigning the details to the variables.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }


}

