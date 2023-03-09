package com.Movie.IMDB.rating.model;

import jakarta.persistence.*;

//This is entity for springboot if we replace entity with Model then it will store in database in the form of rows and coloumn

// This basically tells springboot to create a table to store the data
@Entity
public class Movie {

    @Id   //Setting primary key (Below one int variable)
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto generated value for integer Id
    private int id;
    private String movieName;
    private String movieDescription;


    @Override
    public String toString() // keys are converted into string format
    {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                '}';
    }

    public Movie() {
        this.id = 0;
        this.movieName = "";
        this.movieDescription = "";
    }

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

